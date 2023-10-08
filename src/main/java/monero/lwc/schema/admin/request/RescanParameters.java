package monero.lwc.schema.admin.request;

import org.json.JSONObject;

public class RescanParameters extends AdminParameters {
    public Long height;
    public String[] addresses;

    public RescanParameters(Long height, String[] addresses)
    {
        this.height = height;
        this.addresses = addresses;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("height", this.height);
        object.put("addresses", this.addresses);
        return object;
    }
}
