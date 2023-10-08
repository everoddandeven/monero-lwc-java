package monero.lwc.schema.admin.request;

public class ModifyAccountStatusParameters extends AdminParameters {
    public String status;
    public String[] addresses;

    public ModifyAccountStatusParameters(String status, String[] addresses)
    {
        this.status = status;
        this.addresses = addresses;
    }
}
