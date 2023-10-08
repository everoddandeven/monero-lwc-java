package monero.lwc.schema.admin.request;

public class RejectRequestsParameters extends AdminParameters {
    public String type;
    public String[] addresses;

    public RejectRequestsParameters(String type, String[] addresses)
    {
        this.type = type;
        this.addresses = addresses;
    }
}