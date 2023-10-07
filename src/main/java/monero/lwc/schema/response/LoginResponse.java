package monero.lwc.schema.response;

public class LoginResponse extends LWSResponse {
    public Boolean newAddress;
    public Boolean generatedLocally;
    public Long startHeight;

    public LoginResponse(Boolean newAddress, Boolean generatedLocally, Long startHeight)
    {
        this.newAddress = newAddress;
        this.generatedLocally = generatedLocally;
        this.startHeight = startHeight;
    }
}
