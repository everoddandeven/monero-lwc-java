package monero.lwc.schema.request;

public class GetUnspentOutsRequest extends LWSRequest
{
    public String address;
    public String viewKey;
    public String amount;
    public Long mixin;
    public Boolean useDust;
    public String dustThreshold;

    public GetUnspentOutsRequest(
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
}
