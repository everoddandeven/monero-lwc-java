package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSRejectRequestsRequest extends MoneroLWSAdminRequest {
    public String type;
    public String[] addresses;

    public MoneroLWSRejectRequestsRequest(String type, String[] addresses)
    {
        this.type = type;
        this.addresses = addresses;
    }
}