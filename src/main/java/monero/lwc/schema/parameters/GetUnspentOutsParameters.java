package monero.lwc.schema.parameters;

import org.json.JSONObject;

public class GetUnspentOutsParameters extends BaseLWSParameters
{
    public String address;
    public String viewKey;
    public String amount;
    public Long mixin;
    public Boolean useDust;
    public String dustThreshold;

    public GetUnspentOutsParameters(
            String address,
            String viewKey,
            String amount,
            Long mixin,
            Boolean useDust,
            String dustThreshold
    )
    {
        this.address = address;
        this.viewKey = viewKey;
        this.amount = amount;
        this.mixin = mixin;
        this.useDust = useDust;
        this.dustThreshold = dustThreshold;
    }

    public JSONObject toJSON()
    {
        JSONObject object = new JSONObject();

        object.put("address", this.address);
        object.put("view_key", this.viewKey);
        object.put("amount", this.amount);
        object.put("mixin", this.mixin);
        object.put("use_dust", this.useDust);
        object.put("dust_threshold", this.dustThreshold);

        return object;
    }
}
