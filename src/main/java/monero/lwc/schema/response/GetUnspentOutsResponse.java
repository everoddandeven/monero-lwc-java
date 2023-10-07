package monero.lwc.schema.response;

import monero.lwc.schema.Output;

public class GetUnspentOutsResponse extends LWSResponse {
    public String perByteFee;
    public String feeMask;
    public String amount;
    public Output[] outputs;

    public GetUnspentOutsResponse(
            String perByteFee,
            String feeMask,
            String amount,
            Output[] outputs
    )
    {
        this.perByteFee = perByteFee;
        this.feeMask = feeMask;
        this.amount = amount;
        this.outputs = outputs;
    }
}
