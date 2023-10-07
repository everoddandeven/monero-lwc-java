package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSRescanRequest extends MoneroLWSAdminRequest {
    public Long height;
    public String[] addresses;

    public MoneroLWSRescanRequest(Long height, String[] addresses)
    {
        this.height = height;
        this.addresses = addresses;
    }
}
