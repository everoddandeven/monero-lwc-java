package monero.lwc.client.monero_lws;

import monero.lwc.client.BaseLWClient;
import monero.lwc.schema.request.LWSRequest;
import monero.lwc.schema.response.LWSResponse;

import java.io.IOException;

public class MoneroLWSClient extends BaseLWClient {

    public MoneroLWSClient(String url) throws IOException {
        super(url);
    }

    @Override
    public <ResponseType extends LWSResponse, RequestType extends LWSRequest> ResponseType submitRequest(RequestType requestSchema) {
        return null;
    }
}
