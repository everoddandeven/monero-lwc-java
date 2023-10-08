package monero.lwc;

import monero.lwc.schema.admin.request.*;
import monero.lwc.schema.admin.response.ListAccountsResponse;
import monero.lwc.schema.admin.response.ListRequestsResponse;
import monero.lwc.schema.admin.response.WebhookAddResponse;
import monero.lwc.schema.parameters.*;
import monero.lwc.schema.parameters.GetRandomOutsParameters;
import monero.lwc.schema.response.*;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MoneroLWClient {

    private static HttpURLConnection staticConnection = null;

    private URL url;
    private URL serverUrl;
    private String serverUri;

    private String adminPath = "/admin";

    private String hash = "";

    public MoneroLWClient(String serverUri) throws MalformedURLException {
        this.serverUri = serverUri;
        this.serverUrl = new URL(serverUri);
    }

    private URL getURL(String apiMethod) throws MalformedURLException {
        return new URL(this.serverUri + "/" + apiMethod);
    }

    private HttpURLConnection openConnection(String apiMethod, Boolean staticConnection) throws IOException
    {
        if (staticConnection)
        {
            if (MoneroLWClient.staticConnection == null)
            {
                MoneroLWClient.staticConnection = (HttpURLConnection) this.getURL(apiMethod).openConnection();
                MoneroLWClient.staticConnection.setRequestMethod("POST");
                MoneroLWClient.staticConnection.setRequestProperty("Content-Type", "application/json");
                MoneroLWClient.staticConnection.setDoOutput(true);
            }

            return MoneroLWClient.staticConnection;
        }

        HttpURLConnection connection = (HttpURLConnection) this.getURL(apiMethod).openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        return connection;
    }

    private HttpURLConnection openConnection(String apiMethod) throws IOException
    {
        return this.openConnection(apiMethod,false);
    }


    private JSONObject post(String apiMethod, JSONObject requestBody) throws IOException {
        HttpURLConnection connection = this.openConnection(apiMethod);

        try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
            outputStream.write(requestBody.toString().getBytes("UTF-8"));
        }

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                return new JSONObject(response.toString());
            }
        } else {
            JSONObject error = new JSONObject();
            JSONObject errorDesc = new JSONObject();
            errorDesc.put("code", responseCode);
            errorDesc.put("message", "HTTP Error " + responseCode);
            error.put("error", errorDesc);
            return error;
        }
    }

    //<editor-fold desc="Base Methods">
    private AddressInfo getAddressInfo(GetAddressInfoParameters parameters) throws IOException {
        return AddressInfo.fromJSON(this.post(MoneroLWMethod.GetAddressInfo, parameters.toJSON()));
    }

    public AddressInfo getAddressInfo(String address, String viewKey) throws IOException {
        return this.getAddressInfo(new GetAddressInfoParameters(address, viewKey));
    }

    private AddressTxs getAddressTxs(GetAddressTxsParameters parameters) throws IOException {
        return AddressTxs.fromJSON(this.post(MoneroLWMethod.GetAddressTxs, parameters.toJSON()));
    }

    public AddressTxs getAddressTxs(String address, String viewKey) throws IOException {
        return this.getAddressTxs(new GetAddressTxsParameters(address, viewKey));
    }

    private RandomOuts getRandomOuts(GetRandomOutsParameters parameters) throws IOException {
        return RandomOuts.fromJSON(this.post(MoneroLWMethod.GetRandomOuts, parameters.toJSON()));
    }

    public RandomOuts getRandomOuts(Integer count, String[] amounts) throws IOException {
        return this.getRandomOuts(new GetRandomOutsParameters(count, amounts));
    }

    private UnspentOuts getUnspentOuts(GetUnspentOutsParameters parameters) throws IOException {
        return UnspentOuts.fromJSON(this.post(MoneroLWMethod.GetUnspentOuts, parameters.toJSON()));
    }

    public UnspentOuts getUnspentOuts(
            String address,
            String viewKey,
            String amount,
            Long mixin,
            Boolean useDust,
            String dustThreshold
    ) throws IOException {
        return this.getUnspentOuts(new GetUnspentOutsParameters(
                address,
                viewKey,
                amount,
                mixin,
                useDust,
                dustThreshold
        ));
    }

    private ImportResponse importRequest(ImportParameters parameters) throws IOException {
        return ImportResponse.fromJSON(this.post(MoneroLWMethod.ImportRequest, parameters.toJSON()));
    }

    public ImportResponse importResponse(String address, String viewKey) throws IOException {
        return this.importRequest(new ImportParameters(address, viewKey));
    }

    private LoginResponse login(LoginParameters parameters) throws IOException {
        return LoginResponse.fromJSON(this.post(MoneroLWMethod.Login, parameters.toJSON()));
    }

    private Boolean isAuthenticated()
    {
        return !this.hash.isEmpty();
    }

    public LoginResponse login(
            String address,
            String viewKey,
            Boolean createAccount,
            Boolean generatedLocally
    ) throws IOException {
        return this.login(new LoginParameters(address, viewKey, createAccount, generatedLocally));
    }

    public LoginResponse login(
            String address,
            String viewKey,
            Boolean createAccount
    ) throws IOException {
        return this.login(new LoginParameters(address, viewKey, createAccount));
    }

    public LoginResponse login(
            String address,
            String viewKey
    ) throws IOException {
        return this.login(new LoginParameters(address, viewKey));
    }

    private RawTxInfo submitRawTx(SubmitRawTxParameters parameters) throws IOException {
        return RawTxInfo.fromJSON(this.post(MoneroLWMethod.SubmitRawTx, parameters.toJSON()));
    }

    public RawTxInfo submitRawTx(String tx) throws IOException {
        return this.submitRawTx(new SubmitRawTxParameters(tx));
    }

    //</editor-fold>

    //<editor-fold desc="Admin Methods">

    private JSONObject buildAuthJSONObject(JSONObject object)
    {
        JSONObject authObj = new JSONObject();

        authObj.put("auth", this.hash);
        authObj.put("parameters", object);
        return authObj;
    }

    private JSONObject processJSONObject(JSONObject object)
    {
        JSONObject params = object;

        if (this.isAuthenticated())
        {
            params = this.buildAuthJSONObject(object);
        }

        return params;
    }

    private void acceptRequests(AcceptRequestsParameters parameters) throws IOException {
        JSONObject params = this.processJSONObject(parameters.toJSON());
        this.post(MoneroLWMethod.AcceptRequests, params);
    };

    public void acceptRequests(String type, String[] addresses) throws IOException {
        this.acceptRequests(new AcceptRequestsParameters(type, addresses));
    }

    private void addAccount(AddAccountParameters parameters) throws IOException {
        JSONObject params = this.processJSONObject(parameters.toJSON());

        this.post(MoneroLWMethod.AddAccount, params);
    };

    public void addAccount(String address, String key) throws IOException {
        this.addAccount(new AddAccountParameters(address, key));
    }

    private ListAccountsResponse listAccounts(ListAccountsParameters parameters) throws IOException {
        JSONObject params = this.processJSONObject(parameters.toJSON());
        return ListAccountsResponse.fromJSON(this.post(MoneroLWMethod.ListAccounts, params));
    };

    public ListAccountsResponse listAccounts() throws IOException {
        return this.listAccounts(new ListAccountsParameters());
    }

    private ListRequestsResponse listRequests(ListRequestsParameters parameters) throws IOException {
        JSONObject params = this.processJSONObject(parameters.toJSON());
        return ListRequestsResponse.fromJSON(this.post(MoneroLWMethod.ListRequests, params));
    }

    public ListRequestsResponse listRequests() throws IOException {
        return this.listRequests(new ListRequestsParameters());
    }

    private void modifyAccountStatus(ModifyAccountStatusParameters parameters) throws IOException {
        JSONObject params = this.processJSONObject(parameters.toJSON());
        this.post(MoneroLWMethod.ModifyAccountStatus, params);
    };

    public void modifyAccountStatus(String status, String[] addresses) throws IOException {
        this.modifyAccountStatus(new ModifyAccountStatusParameters(status, addresses));
    }

    private void rejectRequests(RejectRequestsParameters parameters) throws IOException {
        JSONObject params = this.processJSONObject(parameters.toJSON());
        this.post(MoneroLWMethod.RejectRequests, params);
    };

    public void rejectRequests(String type, String[] addresses) throws IOException {
        this.rejectRequests(new RejectRequestsParameters(type, addresses));
    }

    private void rescan(RescanParameters parameters) throws IOException {
        JSONObject params = this.processJSONObject(parameters.toJSON());
        this.post(MoneroLWMethod.Rescan, params);
    };

    public void rescan(Long height, String[] addresses) throws IOException {
        this.rescan(new RescanParameters(height, addresses));
    }

    private void validate(ValidateParameters parameters) throws IOException {
        JSONObject params = this.processJSONObject(parameters.toJSON());
        this.post(MoneroLWMethod.Validate, params);
    };

    public void validate(String viewPublicHex, String spendPublicHex, String viewKeyHex) throws IOException
    {
        this.validate(new ValidateParameters(viewPublicHex, spendPublicHex, viewKeyHex));
    }

    private WebhookAddResponse webhookAdd(WebhookAddParameters parameters) throws IOException
    {
        JSONObject params = this.processJSONObject(parameters.toJSON());
        return WebhookAddResponse.fromJSON(this.post(MoneroLWMethod.WebhookAdd, params));
    }

    public WebhookAddResponse webhookAdd(String type, String address, String url, String token, String paymentId) throws IOException {
        return this.webhookAdd(new WebhookAddParameters(type,address,url,token,paymentId));
    }

    private void webhookDelete(WebhookDeleteParameters parameters) throws IOException {
        this.post(MoneroLWMethod.WebhookDelete, parameters.toJSON());
    }

    public void webhookDelete(String[] addresses) throws IOException {
        this.webhookDelete(new WebhookDeleteParameters(addresses));
    }

    private void webhookDeleteUUID(WebhookDeleteUUIDParameters parameters) throws IOException {
        this.post(MoneroLWMethod.WebhookDelete, parameters.toJSON());
    }

    public void webhookDeleteUUID(String[] eventIds) throws IOException {
        this.webhookDeleteUUID(new WebhookDeleteUUIDParameters(eventIds));
    }

    //</editor-fold>


}
