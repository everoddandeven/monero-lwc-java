package monero.lwc.schema.error;

import org.json.JSONObject;

public class InternalServerError extends BaseError {
    @Override
    public JSONObject toJSON()
    {
        JSONObject object = new JSONObject();
        JSONObject errorDesc = new JSONObject();
        errorDesc.put("code", 500);
        errorDesc.put("message", "Internal Server Error");
        object.put("error", errorDesc);
        return object;
    }
}
