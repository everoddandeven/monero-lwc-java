package monero.lwc.schema.admin.response;

import org.json.JSONObject;

public class WebhookDeleteResponse extends AdminResponse {
    @Override
    public JSONObject toJSON() {
        return new JSONObject();
    }
}
