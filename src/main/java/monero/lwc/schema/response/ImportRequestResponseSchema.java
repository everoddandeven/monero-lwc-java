package monero.lwc.schema.response;

public class ImportRequestResponseSchema extends LWSResponseSchema {
    public String PaymentAddress;
    public String PaymentId;
    public String ImportFee;
    public Boolean NewRequest;
    public Boolean NewRequestFulfilled;
    public String Status;
}
