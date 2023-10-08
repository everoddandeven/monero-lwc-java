package monero.lwc.schema.response;

import monero.lwc.schema.RandomOutput;
import org.json.JSONObject;

public class RandomOuts extends BaseLWSResponse {
    public RandomOutput[] amountOuts;

    public RandomOuts(RandomOutput[] amountOuts)
    {
        this.amountOuts = amountOuts;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
