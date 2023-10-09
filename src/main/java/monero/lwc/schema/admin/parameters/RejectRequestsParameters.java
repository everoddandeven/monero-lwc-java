package monero.lwc.schema.admin.parameters;

import org.json.JSONObject;

public class RejectRequestsParameters extends AdminParameters {
    public String type;
    public String[] addresses;

    public RejectRequestsParameters(String type, String[] addresses)
    {
        this.type = type;
        this.addresses = addresses;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("type", this.type);
        object.put("addresses", this.addresses);
        return object;
    }
}