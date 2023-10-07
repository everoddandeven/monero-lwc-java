package monero.lwc.schema.monero_lws.admin.response;

public class MoneroLWSWebhookAddResponse extends MoneroLWSAdminResponse {
    public String paymentId;
    public String eventId;
    public String token;
    public Long confirmations;
    public String url;

    public MoneroLWSWebhookAddResponse(String eventId, Long confirmations, String url, String paymentId, String token)
    {
        this.paymentId = paymentId;
        this.eventId = eventId;
        this.token = token;
        this.confirmations = confirmations;
        this.url = url;
    }
    public MoneroLWSWebhookAddResponse(String eventId, Long confirmations, String url, String token)
    {
        this(eventId, confirmations, url, "0000000000000000", token);
    }
    public MoneroLWSWebhookAddResponse(String eventId, String paymentId, Long confirmations, String url)
    {
        this(eventId, confirmations, url, paymentId, "");
    }
    public MoneroLWSWebhookAddResponse(String eventId, Long confirmations, String url)
    {
        this(eventId, confirmations, url, "0000000000000000", "");
    }

    public MoneroLWSWebhookAddResponse(String eventId, String url)
    {
        this(eventId, 0L, url, "0000000000000000", "");
    }
}
