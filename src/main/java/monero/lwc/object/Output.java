package monero.lwc.common;

import java.sql.Timestamp;

public class Output {
    public Long TxId;
    public String Amount;
    public Integer Index;
    public String GlobalIndex;
    public String Rct;
    public String TxHash;
    public String TxPrefixHash;
    public String PublicKey;
    public String TxPubKey;
    public String[] SpendKeyImages;
    public Timestamp Timestamp;
    public Long Height;
}
