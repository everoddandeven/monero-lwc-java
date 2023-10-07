package monero.lwc.schema.monero_lws.admin;

public class MoneroLWSAccountInfo extends MoneroLWSAdminSchema {
    public String address;
    public Long scanHeight;
    public Long accessTime;

    public MoneroLWSAccountInfo(String address, Long scanHeight, Long accessTime)
    {
        this.address = address;
        this.scanHeight = scanHeight;
        this.accessTime = accessTime;
    }
}
