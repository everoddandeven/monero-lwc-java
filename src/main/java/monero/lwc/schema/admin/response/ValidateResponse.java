package monero.lwc.schema.admin.response;

import org.json.JSONObject;

public class ValidateResponse extends AdminResponse {
    public String address;

    public ValidateResponse(String address)
    {
        this.address = address;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
