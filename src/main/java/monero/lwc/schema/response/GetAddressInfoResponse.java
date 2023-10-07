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

    public GetAddressInfoResponse(
            String lockedFunds,
            String totalReceived,
            String totalSent,
            Long scannedHeight,
            Long startHeight,
            Long transactionHeight,
            Long blockchainHeight,
            Spend[] spentOutputs,
            Rates rates
    )
    {
        this.lockedFunds = lockedFunds;
        this.totalReceived = totalReceived;
        this.totalSent = totalSent;
        this.scannedHeight = scannedHeight;
        this.startHeight = startHeight;
        this.transactionHeight = transactionHeight;
        this.blockchainHeight = blockchainHeight;
        this.spentOutputs = spentOutputs;
        this.rates = rates;
    }

}
