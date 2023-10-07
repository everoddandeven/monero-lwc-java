package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSWebhookDeleteRequest extends MoneroLWSAdminRequest {
    public String[] addresses;

    public MoneroLWSWebhookDeleteRequest(String[] addresses)
    {
        this.addresses = addresses;
    }
}
