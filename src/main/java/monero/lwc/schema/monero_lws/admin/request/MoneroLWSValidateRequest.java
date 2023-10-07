package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSValidateRequest extends MoneroLWSAdminRequest {
    public String viewPublicHex;
    public String spendPublicHex;
    public String viewKeyHex;

    public MoneroLWSValidateRequest(String viewPublicHex, String spendPublicHex, String viewKeyHex)
    {
        this.viewPublicHex = viewPublicHex;
        this.spendPublicHex = spendPublicHex;
        this.viewKeyHex = viewKeyHex;
    }
}
