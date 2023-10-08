package monero.lwc.schema;

import org.json.JSONObject;

import java.sql.Timestamp;

public class Output extends Schema {
    public Long txId;
    public String amount;
    public Integer index;
    public String globalIndex;
    public String rct;
    public String txHash;
    public String txPrefixHash;
    public String publicKey;
    public String txPubKey;
    public String[] spendKeyImages;
    public Long timestamp;
    public Long height;

    public Output(
            Long txId,
            String amount,
            Integer index,
            String globalIndex,
            String rct,
            String txHash,
            String txPrefixHash,
            String publicKey,
            String txPubKey,
            String[] spendKeyImages,
            Long timestamp,
            Long height
    )
    {
        this.txId = txId;
        this.amount = amount;
        this.index = index;
        this.globalIndex = globalIndex;
        this.rct = rct;
        this.txHash = txHash;
        this.txPrefixHash = txPrefixHash;
        this.publicKey = publicKey;
        this.txPubKey = txPubKey;
        this.spendKeyImages = spendKeyImages;
        this.timestamp = timestamp;
        this.height = height;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
