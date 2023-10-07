package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSModifyAccountStatusRequest extends MoneroLWSAdminRequest {
    public String status;
    public String[] addresses;

    public MoneroLWSModifyAccountStatusRequest(String status, String[] addresses)
    {
        this.status = status;
        this.addresses = addresses;
    }
}
