package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSRescanRequest extends MoneroLWSAdminRequest {
    public Long height;
    public String[] addresses;
}
