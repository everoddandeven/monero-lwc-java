package monero.lwc.schema.request;

public class GetUnspentOutsRequest extends LWSRequest
{
    public String address;
    public String viewKey;
    public String amount;
    public Long mixin;
    public Boolean useDust;
    public String dustThreshold;
}
