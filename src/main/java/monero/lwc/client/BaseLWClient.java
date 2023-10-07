package monero.lwc.client;

import monero.lwc.schema.request.LWSRequest;
import monero.lwc.schema.response.LWSResponse;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class BaseLWClient
{
    protected URL url;

    public BaseLWClient(String url) throws IOException {
        this.url = new URL(url);
    }

    protected HttpURLConnection getConnection() throws IOException {
        return (HttpURLConnection) this.url.openConnection();
    }

    public abstract <ResponseType extends LWSResponse, RequestType extends LWSRequest> ResponseType submitRequest(RequestType requestSchema);
}