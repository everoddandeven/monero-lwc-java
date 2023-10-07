package monero.lwc.schema.request;

public class GetRandomOutsRequest extends LWSRequest {
    public Integer count;
    public String[] amounts;

    public GetRandomOutsRequest(Integer count, String[] amounts)
    {
        this.count = count;
        this.amounts = amounts;
    }
}
