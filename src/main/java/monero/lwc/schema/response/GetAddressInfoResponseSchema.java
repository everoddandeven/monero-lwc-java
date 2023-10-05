package monero.lwc.schema.response;

import monero.lwc.schema.RatesSchema;
import monero.lwc.schema.SpendSchema;

public class GetAddressInfoResponseSchema extends LWSResponseSchema {
    public String LockedFunds;
    public String TotalReceived;
    public String TotalSent;
    public Long ScannedHeight;
    public Long ScannedBlockHeight;
    public Long StartHeight;
    public Long TransactionHeight;
    public Long BlockchainHeight;
    public SpendSchema[] SpentOutputs;
    public RatesSchema RatesSchema;
}
