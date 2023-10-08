package monero.lwc.schema.request;

import org.json.JSONObject;

public class ImportRequestRequest extends BaseLWSRequest {
    public String address;
    public String viewKey;

    public ImportRequestRequest(String address, String viewKey)
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
