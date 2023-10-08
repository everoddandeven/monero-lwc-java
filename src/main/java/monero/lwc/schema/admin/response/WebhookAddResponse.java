package monero.lwc.schema.admin.response;

import org.json.JSONObject;

public class WebhookAddResponse extends AdminResponse {
    public String paymentId;
    public String eventId;
    public String token;
    public Long confirmations;
    public String url;

    public WebhookAddResponse(String eventId, Long confirmations, String url, String paymentId, String token)
    {
        this.paymentId = paymentId;
        this.eventId = eventId;
        this.token = token;
        this.confirmations = confirmations;
        this.url = url;
    }
    public WebhookAddResponse(String eventId, Long confirmations, String url, String token)
    {
        this(eventId, confirmations, url, "0000000000000000", token);
    }
    public WebhookAddResponse(String eventId, String paymentId, Long confirmations, String url)
    {
        this(eventId, confirmations, url, paymentId, "");
    }
    public WebhookAddResponse(String eventId, Long confirmations, String url)
    {
        this(eventId, confirmations, url, "0000000000000000", "");
    }

    public WebhookAddResponse(String eventId, String url)
    {
        this(eventId, 0L, url, "0000000000000000", "");
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
