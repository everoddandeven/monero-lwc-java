package monero.lwc.schema.admin.response;

import org.json.JSONArray;
import org.json.JSONObject;

public class WebhookListResponse extends AdminResponse {
    public JSONArray webhooks;

    public WebhookListResponse(JSONArray webhooks)
    {
        this.webhooks = webhooks;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();

        object.put("webhooks", this.webhooks);

        return object;
    }
}
