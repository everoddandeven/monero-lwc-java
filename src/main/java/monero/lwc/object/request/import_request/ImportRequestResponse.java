package monero.lwc.object.request.import_request;

import monero.lwc.object.request.LWSResponseParameters;

public class ImportRequestResponseParameters extends LWSResponseParameters {
    public String PaymentAddress;
    public String PaymentId;
    public String ImportFee;
    public Boolean NewRequest;
    public Boolean NewRequestFulfilled;
    public String Status;
}
