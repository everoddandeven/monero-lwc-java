package monero.lwc.service.monero_lws;

import monero.lwc.schema.monero_lws.admin.request.*;
import monero.lwc.schema.monero_lws.admin.response.MoneroLWSListAccountsResponseSchema;
import monero.lwc.schema.monero_lws.admin.response.MoneroLWSListRequestsResponseSchema;
import monero.lwc.schema.monero_lws.admin.response.MoneroLWSWebhookAddResponseSchema;
import monero.lwc.schema.request.*;
import monero.lwc.schema.response.*;
import monero.lwc.service.BaseLWService;
import monero.lwc.source.monero_lws.MoneroLWSource;

public class MoneroLWService extends BaseLWService<MoneroLWSource> {

    @Override
    public GetAddressInfoResponseSchema GetAddressInfo(GetAddressInfoRequestSchema requestSchema) {
        return null;
    }

    @Override
    public GetAddressTxsResponseSchema GetAddressTxs(GetAddressTxsRequestSchema requestSchema) {
        return null;
    }

    @Override
    public GetRandomOutsResponseSchema GetRandomOuts(GetRandomOutsRequestSchema requestSchema) {
        return null;
    }

    @Override
    public GetUnspentOutsResponseSchema GetUnspentOuts(GetUnspentOutsRequestSchema requestSchema) {
        return null;
    }

    @Override
    public ImportRequestResponseSchema ImportRequest(ImportRequestRequestSchema requestSchema) {
        return null;
    }

    @Override
    public LoginResponseSchema Login(LoginRequestSchema requestSchema) {
        return null;
    }

    @Override
    public SubmitRawTxResponseSchema SubmitRawTx(SubmitRawTxRequestSchema requestSchema) {
        return null;
    }

    //<editor-fold desc="Admin Methods">

    public void acceptRequests(MoneroLWSAcceptRequestsRequestSchema requestSchema) { };

    public void addAccount(MoneroLWSAddAccountRequestSchema requestSchema) {};

    public MoneroLWSListAccountsResponseSchema listAccounts(MoneroLWSListAccountsRequestSchema requestSchema) { return null; };

    public MoneroLWSListRequestsResponseSchema listRequests(MoneroLWSListRequestsRequestSchema requestSchema) { return null; }

    public void modifyAccountStatus(MoneroLWSModifyAccountStatusRequestSchema requestSchema) {};

    public void rejectRequests(MoneroLWSRejectRequestsRequestSchema requestSchema) {};

    public void rescan(MoneroLWSRescanRequestSchema requestSchema) {};

    public void validate(MoneroLWSValidateRequestSchema requestSchema) {};

    public MoneroLWSWebhookAddResponseSchema webhookAdd(MoneroLWSWebhookAddRequestSchema requestSchema) { return null; };

    //</editor-fold>
}
