package monero.lwc.schema;

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
    public Timestamp timestamp;
    public Long height;
}
