package monero.lwc.schema.monero_lws.admin;

import monero.lwc.schema.monero_lws.MoneroLWSSchema;

public class MoneroLWSAddressInfo extends MoneroLWSSchema {
    public String address;
    public Long startHeight;

    public MoneroLWSAddressInfo(String address, Long startHeight)
    {
        this.address = address;
        this.startHeight = startHeight;
    }
}
