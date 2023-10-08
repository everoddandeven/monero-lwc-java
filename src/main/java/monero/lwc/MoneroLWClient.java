package monero.lwc;

import monero.lwc.service.monero_lws.MoneroLWService;

public class MoneroLWClient {

    private MoneroLWService service;

    public MoneroLWClient(
            String serverUrl
    )
    {
        this.service = new MoneroLWService(serverUrl);
    }

    public MoneroLWClient(
            String serverUrl,
            String auth
    )
    {
        this.service = new MoneroLWService(serverUrl, auth);
    }

}
