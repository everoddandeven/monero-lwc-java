package monero.lwc.schema.monero_lws.admin.response;

public class MoneroLWSWebhookAddResponseSchema extends MoneroLWSAdminResponseSchema {
    public String paymentId;
    public String eventId;
    public String token;
    public Long confirmations;
    public String url;
}
