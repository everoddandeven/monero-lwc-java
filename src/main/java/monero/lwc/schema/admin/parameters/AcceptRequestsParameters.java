package monero.lwc.schema.admin.parameters;

import org.json.JSONObject;

public class AcceptRequestsParameters extends AdminParameters {
    public String type;
    public String[] addresses;

    public AcceptRequestsParameters(String type, String[] addresses)
    {
        this.type = type;
        this.addresses = addresses;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}