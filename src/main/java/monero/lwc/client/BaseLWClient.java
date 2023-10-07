package monero.lwc.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public abstract class BaseLWClient
{
    protected URL url;

    public BaseLWClient(String url) throws IOException {
        this.url = new URL(url);
    }

    public HttpURLConnection getConnection() throws IOException {
        return (HttpURLConnection) this.url.openConnection();
    }

}