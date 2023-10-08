package monero.lwc.schema.parameters;

import org.json.JSONObject;

public class LoginParameters extends BaseLWSParameters {

    public String address;
    public String viewKey;
    public Boolean createAccount;
    public Boolean generatedLocally;

    public LoginParameters(
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

    public LoginParameters(
            String address,
            String viewKey,
            Boolean createAccount
    )
    {
        this(address,viewKey,createAccount,false);
    }

    public LoginParameters(
            String address,
            String viewKey
    )
    {
        this(address,viewKey,false,false);
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();

        object.put("address", this.address);
        object.put("view_key", this.viewKey);
        object.put("create_account", this.createAccount);
        object.put("generated_locally", this.generatedLocally);

        return object;
    }
}
