package monero.lwc.schema.admin.request;

public class WebhookAddParameters extends AdminParameters {
    public String type;
    public String address;
    public String url;
    public String token;
    public String paymentId;

    public WebhookAddParameters(
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
