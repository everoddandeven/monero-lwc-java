package monero.lwc.schema.response;

import org.json.JSONObject;

public class SubmitRawTxResponse extends BaseLWSResponse {
    public String status;

    public SubmitRawTxResponse(String status)
    {
        this.status = status;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
