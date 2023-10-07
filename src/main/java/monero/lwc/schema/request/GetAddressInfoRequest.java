package monero.lwc.schema.request;

public class GetAddressInfoRequest extends LWSRequest {

    public String address;
    public String viewKey;

    public GetAddressInfoRequest(String address, String viewKey)
    {
        this.address = address;
        this.viewKey = viewKey;
    }

}
