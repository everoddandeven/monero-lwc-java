package monero.lwc.schema.request;

import monero.lwc.schema.request.LWSRequestSchema;

public class GetUnspentOutsRequestSchema extends LWSRequestSchema
{
    public String Address;
    public String ViewKey;
    public String Amount;
    public Long Mixin;
    public Boolean UseDust;
    public String DustThreshold;
}
