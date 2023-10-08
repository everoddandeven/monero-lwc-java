package monero.lwc.schema.admin.response;

import org.json.JSONObject;

public class WebhookListResponse extends AdminResponse {
    public JSONObject[] webhooks;

    public WebhookListResponse(JSONObject[] webhooks)
    {
        this.webhooks = webhooks;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
