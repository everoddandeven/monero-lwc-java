package monero.lwc.schema.response;

public class SubmitRawTxResponse extends LWSResponse {
    public String status;

    public SubmitRawTxResponse(String status)
    {
        this.status = status;
    }
}
