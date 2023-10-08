package monero.lwc.schema.response;

import monero.lwc.schema.Rates;
import monero.lwc.schema.Spend;
import org.json.JSONArray;
import org.json.JSONObject;

public class GetAddressInfoResponse extends BaseLWSResponse {
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

    public static GetAddressInfoResponse fromJSON(JSONObject object)
    {
        JSONArray array = object.getJSONArray("spent_outputs");
        Spend[] spentOutputs = new Spend[array.length()];

        for(int i = 0; i < array.length(); i++)
        {
            spentOutputs[i] = Spend.fromJSON(array.getJSONObject(i));
        }

        return new GetAddressInfoResponse(
                object.getString("locked_funds"),
                object.getString("total_received"),
                object.getString("total_sent"),
                object.getLong("scanned_height"),
                object.getLong("start_height"),
                object.getLong("transaction_height"),
                object.getLong("blockchain_height"),
                spentOutputs,
                Rates.fromJSON(object.getJSONObject("rates"))
        );
    }

}
