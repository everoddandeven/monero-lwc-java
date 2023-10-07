package monero.lwc.schema.response;

import monero.lwc.schema.Transaction;

public class GetAddressTxsResponse extends LWSResponse {
    public String totalReceived;
    public Long scannedHeight;
    public Long scannedBlockHeight;
    public Long startHeight;
    public Long blockchainHeight;
    public Transaction[] transactions;

}
