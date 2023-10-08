package monero.lwc.schema.request;

import org.json.JSONObject;

public class SubmitRawTxRequest extends BaseLWSRequest {
    public String tx;

    public SubmitRawTxRequest(String tx)
    {
        this.tx = tx;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();

        object.put("tx", this.tx);

        return object;
    }
}
