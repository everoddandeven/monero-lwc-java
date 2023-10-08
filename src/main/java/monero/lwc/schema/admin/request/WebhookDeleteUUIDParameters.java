package monero.lwc.schema.admin.request;

import org.json.JSONObject;

public class WebhookDeleteUUIDParameters extends AdminParameters {
    public String[] eventIds;

    public WebhookDeleteUUIDParameters(String[] eventIds)
    {
        this.eventIds = eventIds;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("eventIds", this.eventIds);
        return object;
    }
}
