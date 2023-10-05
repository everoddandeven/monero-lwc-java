package monero.lwc.schema.request;

import monero.lwc.schema.request.LWSRequestSchema;

public class GetRandomOutsRequestSchema extends LWSRequestSchema {
    public Integer Count;
    public String[] Amounts;
}
