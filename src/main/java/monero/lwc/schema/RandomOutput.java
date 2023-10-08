package monero.lwc.schema;

import org.json.JSONObject;

public class RandomOutput extends Schema {
    public String globalIndex;
    public String publicKey;
    public String rct;

    public RandomOutput(String globalIndex, String publicKey, String rct)
    {
        this.globalIndex = globalIndex;
        this.publicKey = publicKey;
        this.rct = rct;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
