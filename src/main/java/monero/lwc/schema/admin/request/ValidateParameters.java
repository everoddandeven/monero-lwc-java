package monero.lwc.schema.admin.request;

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
}
