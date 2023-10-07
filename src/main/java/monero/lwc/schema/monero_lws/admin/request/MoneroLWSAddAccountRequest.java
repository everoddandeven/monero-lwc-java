package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSAddAccountRequest extends MoneroLWSAdminRequest {
    public String address;
    public String key;

    public MoneroLWSAddAccountRequest(String address, String key)
    {
        this.address = address;
        this.key = key;
    }
}
