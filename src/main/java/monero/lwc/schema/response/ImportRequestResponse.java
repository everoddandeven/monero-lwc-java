package monero.lwc.schema.response;

import org.json.JSONObject;

public class ImportRequestResponse extends BaseLWSResponse {
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

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
