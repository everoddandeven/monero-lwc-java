package monero.lwc.schema;

import org.json.JSONObject;

public class RandomOutputs extends Schema {
    public String amount;
    public Output[] outputs;

    public RandomOutputs(String amount, Output[] outputs)
    {
        this.amount = amount;
        this.outputs = outputs;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
