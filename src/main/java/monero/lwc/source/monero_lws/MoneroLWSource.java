package monero.lwc.source.monero_lws;

import monero.lwc.source.BaseLWSource;

public class MoneroLWSource extends BaseLWSource {

    public MoneroLWSource(String uri)
    {
        super(uri);
    }
    public MoneroLWSource(String hostname, Integer port)
    {
        super(hostname + ':' + port.toString());
    }
}
