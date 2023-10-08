package monero.lwc.service.monero_lws;

import monero.lwc.client.monero_lws.MoneroLWRestClient;
import monero.lwc.schema.monero_lws.admin.request.*;
import monero.lwc.schema.monero_lws.admin.response.MoneroLWSListAccountsResponse;
import monero.lwc.schema.monero_lws.admin.response.MoneroLWSListRequestsResponse;
import monero.lwc.schema.monero_lws.admin.response.MoneroLWSWebhookAddResponse;
import monero.lwc.schema.request.*;
import monero.lwc.schema.response.*;
import monero.lwc.service.BaseLWService;
import monero.lwc.source.monero_lws.MoneroLWSource;

public class MoneroLWService extends BaseLWService<MoneroLWSource, MoneroLWRestClient> {

    protected MoneroLWService(MoneroLWSource source, MoneroLWRestClient client) {
        this.source = source;
        this.client = client;
    }

    public MoneroLWService(String serverUrl, String auth)
    {
        this.source = new MoneroLWSource(serverUrl);
        this.client = new MoneroLWRestClient(serverUrl, auth);
    }

    public MoneroLWService(String serverUrl)
    {
        this.source = new MoneroLWSource(serverUrl);
        this.client = new MoneroLWRestClient(serverUrl, "");
    }


    //<editor-fold desc="Base Methods">
    @Override
    protected GetAddressInfoResponse getAddressInfo(GetAddressInfoRequest requestSchema) {
        return null;
    }

    @Override
    protected GetAddressTxsResponse getAddressTxs(GetAddressTxsRequest requestSchema) {
        return null;
    }

    @Override
    protected GetRandomOutsResponse getRandomOuts(GetRandomOutsRequest requestSchema) {
        return null;
    }

    @Override
    protected GetUnspentOutsResponse getUnspentOuts(GetUnspentOutsRequest requestSchema) {
        return null;
    }

    @Override
    protected ImportRequestResponse importRequest(ImportRequestRequest requestSchema) {
        return null;
    }

    @Override
    protected LoginResponse login(LoginRequest requestSchema) {
        return null;
    }

    @Override
    protected SubmitRawTxResponse submitRawTx(SubmitRawTxRequest requestSchema) {
        return null;
    }

    //</editor-fold>

    //<editor-fold desc="Admin Methods">

    protected void acceptRequests(MoneroLWSAcceptRequestsRequest requestSchema) { };

    public void acceptRequests(String type, String[] addresses)
    {
        this.acceptRequests(new MoneroLWSAcceptRequestsRequest(type, addresses));
    }

    protected void addAccount(MoneroLWSAddAccountRequest requestSchema) {};

    public void addAccount(String address, String key)
    {
        this.addAccount(new MoneroLWSAddAccountRequest(address, key));
    }

    protected MoneroLWSListAccountsResponse listAccounts(MoneroLWSListAccountsRequest requestSchema) { return null; };

    public MoneroLWSListAccountsResponse listAccounts()
    {
        return this.listAccounts(new MoneroLWSListAccountsRequest());
    }

    protected MoneroLWSListRequestsResponse listRequests(MoneroLWSListRequestsRequest requestSchema) { return null; }

    public MoneroLWSListRequestsResponse listRequests()
    {
        return this.listRequests(new MoneroLWSListRequestsRequest());
    }

    protected void modifyAccountStatus(MoneroLWSModifyAccountStatusRequest requestSchema) {};

    public void modifyAccountStatus(String status, String[] addresses)
    {
        this.modifyAccountStatus(new MoneroLWSModifyAccountStatusRequest(status, addresses));
    }

    protected void rejectRequests(MoneroLWSRejectRequestsRequest requestSchema) {};

    public void rejectRequests(String type, String[] addresses)
    {
        this.rejectRequests(new MoneroLWSRejectRequestsRequest(type, addresses));
    }

    protected void rescan(MoneroLWSRescanRequest requestSchema) {};

    public void rescan(Long height, String[] addresses)
    {
        this.rescan(new MoneroLWSRescanRequest(height, addresses));
    }

    protected void validate(MoneroLWSValidateRequest requestSchema) {};

    public void validate(String viewPublicHex, String spendPublicHex, String viewKeyHex)
    {
        this.validate(new MoneroLWSValidateRequest(viewPublicHex, spendPublicHex, viewKeyHex));
    }

    protected MoneroLWSWebhookAddResponse webhookAdd(MoneroLWSWebhookAddRequest requestSchema) { return null; };

    //</editor-fold>

}
