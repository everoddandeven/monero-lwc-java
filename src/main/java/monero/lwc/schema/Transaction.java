package monero.lwc.schema;

import org.json.JSONObject;

import java.sql.Time;
import java.sql.Timestamp;

public class Transaction extends Schema {
    public Long id;
    public String hash;
    public Long timestamp;
    public String totalReceived;
    public String totalSent;
    public Long unlockTime;
    public Long height;

    public Spend[] spendOutputs;
    public String paymentId;
    public Boolean coinbase;
    public Boolean mempool;
    public Integer mixin;

    public Transaction(
            Long id,
            String hash,
            Long timestamp,
            String totalReceived,
            String totalSent,
            Long height,
            Spend[] spendOutputs,
            String paymentId,
            Boolean coinbase,
            Boolean mempool,
            Integer mixin
    )
    {
        this.id = id;
        this.hash = hash;
        this.timestamp = timestamp;
        this.totalReceived = totalReceived;
        this.totalSent = totalSent;
        this.height = height;
        this.spendOutputs = spendOutputs;
        this.paymentId = paymentId;
        this.coinbase = coinbase;
        this.mempool = mempool;
        this.mixin = mixin;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
