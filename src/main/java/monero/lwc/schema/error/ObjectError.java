package monero.lwc.schema.error;

import org.json.JSONObject;

public class ObjectError extends BaseError {
    public String field;
    public String details;

    public ObjectError(String field, String details)
    {
        this.field = field;
        this.details = details;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("field", this.field);
        object.put("details", this.details);
        return object;
    }
}
