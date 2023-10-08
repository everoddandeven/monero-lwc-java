package monero.lwc.schema.admin;

import org.json.JSONObject;

public class MoneroLWSAddressInfo extends AdminSchema {
    public String address;
    public Long startHeight;

    public MoneroLWSAddressInfo(String address, Long startHeight)
    {
        this.address = address;
        this.startHeight = startHeight;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
