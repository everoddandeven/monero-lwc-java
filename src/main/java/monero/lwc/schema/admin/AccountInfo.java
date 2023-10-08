package monero.lwc.schema.admin;

import org.json.JSONObject;

public class AccountInfo extends AdminSchema {
    public String address;
    public Long scanHeight;
    public Long accessTime;

    public AccountInfo(String address, Long scanHeight, Long accessTime)
    {
        this.address = address;
        this.scanHeight = scanHeight;
        this.accessTime = accessTime;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
