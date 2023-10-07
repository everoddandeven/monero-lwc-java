package monero.lwc.service.monero_lws;

import monero.lwc.client.monero_lws.MoneroLWSClient;
import monero.lwc.schema.monero_lws.admin.request.*;
import monero.lwc.schema.monero_lws.admin.response.MoneroLWSListAccountsResponse;
import monero.lwc.schema.monero_lws.admin.response.MoneroLWSListRequestsResponse;
import monero.lwc.schema.monero_lws.admin.response.MoneroLWSWebhookAddResponse;
import monero.lwc.schema.request.*;
import monero.lwc.schema.response.*;
import monero.lwc.service.BaseLWService;
import monero.lwc.source.monero_lws.MoneroLWSource;

public class MoneroLWService extends BaseLWService<MoneroLWSource, MoneroLWSClient> {

    //<editor-fold desc="Base Methods">
    @Override
    protected GetAddressInfoResponse getAddressInfo(GetAddressInfoRequest requestSchema) {
        return null;
    }

    @Override
    protected GetAddressTxsResponse getAddressTxs(GetAddressTxsRequest requestSchema) {
        return null;
    }

    @Override
    protected GetRandomOutsResponse getRandomOuts(GetRandomOutsRequest requestSchema) {
        return null;
    }

    @Override
    protected GetUnspentOutsResponse getUnspentOuts(GetUnspentOutsRequest requestSchema) {
        return null;
    }

    @Override
    protected ImportRequestResponse importRequest(ImportRequestRequest requestSchema) {
        return null;
    }

    @Override
    protected LoginResponse login(LoginRequest requestSchema) {
        return null;
    }

    @Override
    protected SubmitRawTxResponse submitRawTx(SubmitRawTxRequest requestSchema) {
        return null;
    }

    //</editor-fold>

    //<editor-fold desc="Admin Methods">

    protected void acceptRequests(MoneroLWSAcceptRequestsRequest requestSchema) { };

    public void acceptRequests(String type, String[] addresses)
    {
        this.client.<LWSResponse, MoneroLWSAcceptRequestsRequest>submitRequest(new MoneroLWSAcceptRequestsRequest(type, addresses));
    }

    protected void addAccount(MoneroLWSAddAccountRequest requestSchema) {};

    public void addAccount(String address, String key)
    {

    }

    protected MoneroLWSListAccountsResponse listAccounts(MoneroLWSListAccountsRequest requestSchema) { return null; };

    protected MoneroLWSListRequestsResponse listRequests(MoneroLWSListRequestsRequest requestSchema) { return null; }

    protected void modifyAccountStatus(MoneroLWSModifyAccountStatusRequest requestSchema) {};

    protected void rejectRequests(MoneroLWSRejectRequestsRequest requestSchema) {};

    protected void rescan(MoneroLWSRescanRequest requestSchema) {};

    protected void validate(MoneroLWSValidateRequest requestSchema) {};

    protected MoneroLWSWebhookAddResponse webhookAdd(MoneroLWSWebhookAddRequest requestSchema) { return null; };

    //</editor-fold>

}
