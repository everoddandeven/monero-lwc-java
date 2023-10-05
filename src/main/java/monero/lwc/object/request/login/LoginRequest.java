package monero.lwc.object.request.login;

import monero.lwc.object.request.LWSRequestParameters;

public class LoginRequestParameters extends LWSRequestParameters {
    public String Address;
    public String ViewKey;
    public Boolean CreateAccount;
    public Boolean GeneratedLocally;
}
