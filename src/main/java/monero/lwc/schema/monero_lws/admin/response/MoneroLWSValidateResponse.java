package monero.lwc.schema.monero_lws.admin.response;

public class MoneroLWSValidateResponse extends MoneroLWSAdminResponse {
    public String address;

    public MoneroLWSValidateResponse(String address)
    {
        this.address = address;
    }
}
