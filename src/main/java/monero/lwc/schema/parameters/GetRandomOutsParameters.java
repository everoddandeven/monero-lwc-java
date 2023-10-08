package monero.lwc.schema.parameters;

import org.json.JSONObject;

public class GetRandomOutsParameters extends BaseLWSParameters {
    public Integer count;
    public String[] amounts;

    public GetRandomOutsParameters(Integer count, String[] amounts)
    {
        this.count = count;
        this.amounts = amounts;
    }

    public JSONObject toJSON()
    {
        JSONObject object = new JSONObject();

        object.put("count", this.count);
        object.put("amounts", this.amounts);

        return object;
    }
}
