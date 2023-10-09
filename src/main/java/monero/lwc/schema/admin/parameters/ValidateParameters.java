package monero.lwc.schema.admin.parameters;

import org.json.JSONObject;

public class ValidateParameters extends AdminParameters {
    public String viewPublicHex;
    public String spendPublicHex;
    public String viewKeyHex;

    public ValidateParameters(String viewPublicHex, String spendPublicHex, String viewKeyHex)
    {
        this.viewPublicHex = viewPublicHex;
        this.spendPublicHex = spendPublicHex;
        this.viewKeyHex = viewKeyHex;
    }

    @Override
    public JSONObject toJSON()
    {
        JSONObject object = new JSONObject();
        object.put("view_public_hex", this.viewKeyHex);
        object.put("spend_public_hex", this.spendPublicHex);
        object.put("view_key_hex", this.viewKeyHex);
        return object;
    }
}
