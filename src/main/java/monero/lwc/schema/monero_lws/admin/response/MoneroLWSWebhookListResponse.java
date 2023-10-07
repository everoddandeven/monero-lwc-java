package monero.lwc.schema.monero_lws.admin.response;

import org.json.JSONObject;

public class MoneroLWSWebhookListResponse extends MoneroLWSAdminResponse {
    public JSONObject[] webhooks;

    public MoneroLWSWebhookListResponse(JSONObject[] webhooks)
    {
        this.webhooks = webhooks;
    }
}
