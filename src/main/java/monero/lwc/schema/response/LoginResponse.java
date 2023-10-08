package monero.lwc.schema.response;

import org.json.JSONObject;

public class LoginResponse extends BaseLWSResponse {
    public Boolean newAddress;
    public Boolean generatedLocally;
    public Long startHeight;

    public LoginResponse(Boolean newAddress, Boolean generatedLocally, Long startHeight)
    {
        this.newAddress = newAddress;
        this.generatedLocally = generatedLocally;
        this.startHeight = startHeight;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
