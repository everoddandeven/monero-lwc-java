package monero.lwc.source;

public abstract class BaseLWSource {

    protected String Uri;

    protected BaseLWSource(String uri)
    {
        this.Uri = uri;
    }

    public void SetUri(String uri)
    {
        this.Uri = uri;
    }

    public String GetUri()
    {
        return this.Uri;
    }

    public String GetAddressInfoUri()
    {
        return this.Uri + LWMethod.GetAddressInfo;
    }

    public String GetAddressTxsUri()
    {
        return this.Uri + LWMethod.GetAddressTxs;
    }

    public String GetRandomOutsUri()
    {
        return this.Uri + LWMethod.GetRandomOuts;
    }

    public String GetUnspentOutsUri()
    {
        return this.Uri + LWMethod.GetUnspentOuts;
    }

    public String ImportRequestUri()
    {
        return this.Uri + LWMethod.ImportRequest;
    }

    public String LoginUri()
    {
        return this.Uri + LWMethod.Login;
    }

    public String SubmitRawTxUri()
    {
        return this.Uri + LWMethod.SubmitRawTx;
    }
}