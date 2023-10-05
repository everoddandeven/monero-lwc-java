package monero.lwc.common;

import java.sql.Timestamp;

public class Transaction {
    public Long Id;
    public String Hash;
    public Timestamp Timestamp;
    public String TotalReceived;
    public String TotalSent;
    public Long UnlockTime;
    public Long Height;

    public Spend[] SpendOutputs;
    public String PaymentId;
    public Boolean Coinbase;
    public Boolean Mempool;
    public Integer Mixin;
}
