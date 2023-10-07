package monero.lwc.schema.request;

public class ImportRequestRequest extends LWSRequest {
    public String address;
    public String viewKey;

    public ImportRequestRequest(String address, String viewKey)
    {
        this.address = address;
        this.viewKey = viewKey;
    }
}
