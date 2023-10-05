package monero.lwc.schema.response;

import monero.lwc.schema.TransactionSchema;

public class GetAddressTxsResponseSchema extends LWSResponseSchema {
    public String TotalReceived;
    public Long ScannedHeight;
    public Long ScannedBlockHeight;
    public Long StartHeight;
    public Long BlockchainHeight;
    public TransactionSchema[] transactionSchemas;

}
