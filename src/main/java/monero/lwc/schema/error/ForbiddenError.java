package monero.lwc.schema.error;

import org.json.JSONObject;

public class ForbiddenError extends BaseError {
    @Override
    public JSONObject toJSON()
    {
        JSONObject object = new JSONObject();
        JSONObject errorDesc = new JSONObject();
        errorDesc.put("code", 403);
        errorDesc.put("message", "Forbidden");
        object.put("error", errorDesc);
        return object;
    }
}
