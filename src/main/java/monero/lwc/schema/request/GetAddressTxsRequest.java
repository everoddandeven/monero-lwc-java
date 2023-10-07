package monero.lwc.schema.request;

public class GetAddressTxsRequest extends LWSRequest {
    public String address;
    public String viewKey;

    public GetAddressTxsRequest(String address, String viewKey)
    {
        this.address = address;
        this.viewKey = viewKey;
    }
}
