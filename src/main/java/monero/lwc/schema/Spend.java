package monero.lwc.schema;

public class Spend extends Schema {
    public String amount;
    public String keyImage;
    public String txPubKey;
    public Integer outIndex;
    public Integer mixin;

    public Spend(
            String amount,
            String keyImage,
            String txPubKey,
            Integer outIndex,
            Integer mixin
    )
    {
        this.amount = amount;
        this.keyImage = keyImage;
        this.txPubKey = txPubKey;
        this.outIndex = outIndex;
        this.mixin = mixin;
    }
}