package monero.lwc.schema.request;

import monero.lwc.schema.request.LWSRequestSchema;

public class LoginRequestSchema extends LWSRequestSchema {
    public String Address;
    public String ViewKey;
    public Boolean CreateAccount;
    public Boolean GeneratedLocally;
}
