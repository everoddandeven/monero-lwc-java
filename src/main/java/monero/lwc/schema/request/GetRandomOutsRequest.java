package monero.lwc.schema.request;

import org.json.JSONObject;

public class GetRandomOutsRequest extends BaseLWSRequest {
    public Integer count;
    public String[] amounts;

    public GetRandomOutsRequest(Integer count, String[] amounts)
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
