package monero.lwc.schema.response;

import monero.lwc.schema.OutputSchema;

public class GetUnspentOutsResponseSchema extends LWSResponseSchema {
    public String PerByteFee;
    public String FeeMask;
    public String Amount;
    public OutputSchema[] outputSchemas;
}
