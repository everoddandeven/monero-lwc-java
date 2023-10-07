package monero.lwc.schema.monero_lws.admin.request;

import monero.lwc.schema.request.LWSRequest;
import monero.lwc.service.monero_lws.auth.MoneroLWSAuthService;

public abstract class MoneroLWSAdminRequest extends LWSRequest {

    public String getAuth()
    {
        return MoneroLWSAuthService.getInstanceHash();
    }

}
