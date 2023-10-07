package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSWebhookAddRequest extends MoneroLWSAdminRequest {
    public String type;
    public String address;
    public String url;
    public String token;
    public String paymentId;

    public MoneroLWSWebhookAddRequest(
            String type,
            String address,
            String url,
            String token,
            String paymentId
    )
    {
        this.type = type;
        this.address = address;
        this.url = url;
        this.token = token;
        this.paymentId = paymentId;
    }
}
