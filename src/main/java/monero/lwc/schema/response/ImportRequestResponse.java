package monero.lwc.schema.response;

public class ImportRequestResponse extends LWSResponse {
    public String paymentAddress;
    public String paymentId;
    public String importFee;
    public Boolean newRequest;
    public Boolean newRequestFulfilled;
    public String status;
}
