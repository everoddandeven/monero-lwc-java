package monero.lwc.schema.admin.parameters;

import org.json.JSONObject;

public class WebhookDeleteParameters extends AdminParameters {
    public String[] addresses;

    public WebhookDeleteParameters(String[] addresses)
    {
        this.addresses = addresses;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("addresses", this.addresses);
        return object;
    }
}
