package monero.lwc.schema.admin.request;

public class AddAccountParameters extends AdminParameters {
    public String address;
    public String key;

    public AddAccountParameters(String address, String key)
    {
        this.address = address;
        this.key = key;
    }
}
