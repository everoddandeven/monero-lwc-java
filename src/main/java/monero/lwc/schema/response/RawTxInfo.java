package monero.lwc.schema.response;

import org.json.JSONObject;

public class RawTxInfo extends BaseLWSResponse {
    public String status;

    public RawTxInfo(String status)
    {
        this.status = status;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
