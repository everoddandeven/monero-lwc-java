package monero.lwc.schema.error;

import org.json.JSONObject;

public class NotFoundError extends BaseError {
    @Override
    public JSONObject toJSON()
    {
        JSONObject object = new JSONObject();
        JSONObject errorDesc = new JSONObject();
        errorDesc.put("code", 404);
        errorDesc.put("message", "Not Found");
        object.put("error", errorDesc);
        return object;
    }
}
