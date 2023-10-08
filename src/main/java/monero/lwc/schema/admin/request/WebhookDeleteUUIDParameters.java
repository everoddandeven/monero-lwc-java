package monero.lwc.schema.admin.request;

public class WebhookDeleteUUIDParameters extends AdminParameters {
    public String[] eventIds;

    public WebhookDeleteUUIDParameters(String[] eventIds)
    {
        this.eventIds = eventIds;
    }
}
