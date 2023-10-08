package monero.lwc.schema.admin.request;

import org.json.JSONObject;

public class ListAccountsParameters extends AdminParameters {

    @Override
    public JSONObject toJSON() {
        return new JSONObject();
    }
}
