package monero.lwc.schema.response;

import monero.lwc.schema.Rates;
import monero.lwc.schema.Spend;

public class GetAddressInfoResponse extends LWSResponse {
    public String lockedFunds;
    public String totalReceived;
    public String totalSent;
    public Long scannedHeight;
    public Long scannedBlockHeight;
    public Long startHeight;
    public Long transactionHeight;
    public Long blockchainHeight;
    public Spend[] spentOutputs;
    public Rates rates;
}
