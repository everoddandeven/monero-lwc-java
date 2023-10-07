package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSWebhookAddRequest extends MoneroLWSAdminRequest {
    public String type;
    public String address;
    public String url;
    public String token;
    public String paymentId;
}
