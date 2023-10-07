package monero.lwc.schema.request;

public class LoginRequest extends LWSRequest {
    public String address;
    public String viewKey;
    public Boolean createAccount;
    public Boolean generatedLocally;

    public LoginRequest(
            String address,
            String viewKey,
            Boolean createAccount,
            Boolean generatedLocally
    )
    {
        this.address = address;
        this.viewKey = viewKey;
        this.createAccount = createAccount;
        this.generatedLocally = generatedLocally;
    }
}
