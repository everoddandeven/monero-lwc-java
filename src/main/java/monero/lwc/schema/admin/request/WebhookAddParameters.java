package monero.lwc.schema.admin.request;

import org.json.JSONObject;

public class WebhookAddParameters extends AdminParameters {
    public String type;
    public String address;
    public String url;
    public String token;
    public String paymentId;

    public WebhookAddParameters(
            String type,
            String address,
            String url,
            String token,
            String paymentId
    )
    {
        this.type = type;
        this.address = address;
        this.url = url;
        this.token = token;
        this.paymentId = paymentId;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("type", this.type);
        object.put("address", this.address);
        object.put("url", this.url);
        object.put("token", this.token);
        object.put("payment_id", this.paymentId);

        return object;
    }
}
