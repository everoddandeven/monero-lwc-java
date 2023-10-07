package monero.lwc.schema.response;

public class ImportRequestResponse extends LWSResponse {
    public String paymentAddress;
    public String paymentId;
    public String importFee;
    public Boolean newRequest;
    public Boolean newRequestFulfilled;
    public String status;

    public ImportRequestResponse(
            String paymentAddress,
            String paymentId,
            String importFee,
            Boolean newRequest,
            Boolean newRequestFulfilled,
            String status
    )
    {
        this.paymentAddress = paymentAddress;
        this.paymentId = paymentId;
        this.importFee = importFee;
        this.newRequest = newRequest;
        this.newRequestFulfilled = newRequestFulfilled;
        this.status = status;
    }
}
