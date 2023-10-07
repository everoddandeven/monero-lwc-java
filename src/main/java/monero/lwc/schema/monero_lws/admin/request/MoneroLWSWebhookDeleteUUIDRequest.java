package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSWebhookDeleteUUIDRequest extends MoneroLWSAdminRequest {
    public String[] eventIds;

    public MoneroLWSWebhookDeleteUUIDRequest(String[] eventIds)
    {
        this.eventIds = eventIds;
    }
}
