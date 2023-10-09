package monero.lwc.schema.admin.parameters;

import org.json.JSONObject;

public class AddAccountParameters extends AdminParameters {
    public String address;
    public String key;

    public AddAccountParameters(String address, String key)
    {
        this.address = address;
        this.key = key;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("address", this.address);
        object.put("key", this.key);
        return object;
    }
}
