package monero.lwc.client.monero_lws;

import monero.lwc.client.BaseRestClient;
import monero.lwc.schema.monero_lws.admin.request.MoneroLWSAdminRequest;
import monero.lwc.schema.request.BaseLWSRequest;
import monero.lwc.schema.response.BaseLWSResponse;
import org.json.JSONObject;
import java.io.IOException;


public class MoneroLWRestClient extends BaseRestClient {

    private String auth = "";

    public MoneroLWRestClient(String baseUrl, String auth) {
        super(baseUrl);
        this.auth = auth;
    }

    private static Boolean isAdminRequest(BaseLWSRequest request)
    {
        return request instanceof MoneroLWSAdminRequest;
    }

    private JSONObject buildAuthJSONObject(JSONObject jsonObject)
    {
        JSONObject authJSONObject = new JSONObject();

        authJSONObject.put("auth", this.auth);
        authJSONObject.put("params", jsonObject);

        return  authJSONObject;
    }

    @Override
    public <T extends BaseLWSResponse, V extends BaseLWSRequest> T post(String apiMethod, V requestSchema) throws IOException {
        if (MoneroLWRestClient.isAdminRequest(requestSchema) && !this.auth.isEmpty())
        {
            return T.fromJSON(this.post(apiMethod, this.buildAuthJSONObject(requestSchema.toJSON())));
        }

        return super.post(apiMethod, requestSchema);
    }
}
