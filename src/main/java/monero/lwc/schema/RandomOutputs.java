package monero.lwc.schema;

public class RandomOutputs extends Schema {
    public String amount;
    public Output[] outputs;

    public RandomOutputs(String amount, Output[] outputs)
    {
        this.amount = amount;
        this.outputs = outputs;
    }
}
