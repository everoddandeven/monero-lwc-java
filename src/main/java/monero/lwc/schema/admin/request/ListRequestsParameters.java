package monero.lwc.schema.admin.request;

import org.json.JSONObject;

public class ListRequestsParameters extends AdminParameters {

    @Override
    public JSONObject toJSON() {
        return new JSONObject();
    }
}
