package monero.lwc.schema.admin.request;

public class WebhookDeleteParameters extends AdminParameters {
    public String[] addresses;

    public WebhookDeleteParameters(String[] addresses)
    {
        this.addresses = addresses;
    }
}
