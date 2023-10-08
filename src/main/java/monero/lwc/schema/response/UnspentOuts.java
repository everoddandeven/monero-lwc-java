package monero.lwc.schema.response;

import monero.lwc.schema.Output;
import org.json.JSONObject;

public class UnspentOuts extends BaseLWSResponse {
    public String perByteFee;
    public String feeMask;
    public String amount;
    public Output[] outputs;

    public UnspentOuts(
            String perByteFee,
            String feeMask,
            String amount,
            Output[] outputs
    )
    {
        this.perByteFee = perByteFee;
        this.feeMask = feeMask;
        this.amount = amount;
        this.outputs = outputs;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
