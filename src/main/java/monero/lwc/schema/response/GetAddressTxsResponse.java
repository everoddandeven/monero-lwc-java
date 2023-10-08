package monero.lwc.schema.response;

import monero.lwc.schema.Transaction;
import org.json.JSONObject;

public class GetAddressTxsResponse extends BaseLWSResponse {
    public String totalReceived;
    public Long scannedHeight;
    public Long scannedBlockHeight;
    public Long startHeight;
    public Long blockchainHeight;
    public Transaction[] transactions;

    public GetAddressTxsResponse(
            String totalReceived,
            Long scannedHeight,
            Long scannedBlockHeight,
            Long startHeight,
            Long blockchainHeight,
            Transaction[] transactions
    )
    {
        this.totalReceived = totalReceived;
        this.scannedHeight = scannedHeight;
        this.scannedBlockHeight = scannedBlockHeight;
        this.startHeight = startHeight;
        this.blockchainHeight = blockchainHeight;
        this.transactions = transactions;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
