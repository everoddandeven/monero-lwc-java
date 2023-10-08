package monero.lwc.schema.parameters;

import org.json.JSONObject;

public class SubmitRawTxParameters extends BaseLWSParameters {
    public String tx;

    public SubmitRawTxParameters(String tx)
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
