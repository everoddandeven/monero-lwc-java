package monero.lwc.object.request.get_unspent_outs;

public class GetUnspentOutsRequestParameters
{
    public String Address;
    public String ViewKey;
    public String Amount;
    public Long Mixin;
    public Boolean UseDust;
    public String DustThreshold;
}
