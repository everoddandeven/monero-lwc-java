package monero.lwc.schema.request;

public class SubmitRawTxRequest extends LWSRequest {
    public String tx;

    public SubmitRawTxRequest(String tx)
    {
        this.tx = tx;
    }
}