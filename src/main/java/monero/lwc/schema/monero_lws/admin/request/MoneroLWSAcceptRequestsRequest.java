package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSAcceptRequestsRequest extends MoneroLWSAdminRequest {
    public String type;
    public String[] addresses;

    public MoneroLWSAcceptRequestsRequest(String type, String[] addresses)
    {
        this.type = type;
        this.addresses = addresses;
    }
}