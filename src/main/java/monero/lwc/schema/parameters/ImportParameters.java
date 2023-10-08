package monero.lwc.schema.parameters;

import org.json.JSONObject;

public class ImportParameters extends BaseLWSParameters {
    public String address;
    public String viewKey;

    public ImportParameters(String address, String viewKey)
    {
        this.address = address;
        this.viewKey = viewKey;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();

        object.put("address", this.address);
        object.put("view_key", this.viewKey);

        return object;
    }
}
