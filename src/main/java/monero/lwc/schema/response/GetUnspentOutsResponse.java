package monero.lwc.schema.response;

import monero.lwc.schema.Output;

public class GetUnspentOutsResponse extends LWSResponse {
    public String perByteFee;
    public String feeMask;
    public String amount;
    public Output[] outputs;
}
