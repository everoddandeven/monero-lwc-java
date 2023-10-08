package monero.lwc.schema.admin.request;

import org.json.JSONObject;

public class ModifyAccountStatusParameters extends AdminParameters {
    public String status;
    public String[] addresses;

    public ModifyAccountStatusParameters(String status, String[] addresses)
    {
        this.status = status;
        this.addresses = addresses;
    }

    @Override
    public JSONObject toJSON()
    {
        JSONObject object = new JSONObject();
        object.put("status", this.status);
        object.put("addresses", this.addresses);
        return object;
    }
}
