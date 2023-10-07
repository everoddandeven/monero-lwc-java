package monero.lwc.schema.request;

public class LoginRequest extends LWSRequest {
    public String address;
    public String viewKey;
    public Boolean createAccount;
    public Boolean generatedLocally;
}
