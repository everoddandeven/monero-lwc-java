package monero.lwc.schema.admin.request;

public class RescanParameters extends AdminParameters {
    public Long height;
    public String[] addresses;

    public RescanParameters(Long height, String[] addresses)
    {
        this.height = height;
        this.addresses = addresses;
    }
}
