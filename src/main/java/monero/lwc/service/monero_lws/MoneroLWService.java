package monero.lwc.service.monero_lws;

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
}
