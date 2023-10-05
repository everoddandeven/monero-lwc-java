package monero.lwc.object.request.get_unspent_outs;

import monero.lwc.object.Output;
import monero.lwc.object.request.LWSResponse;

public class GetUnspentOutsResponse extends LWSResponse {
    public String PerByteFee;
    public String FeeMask;
    public String Amount;
    public Output[] Outputs;
}
