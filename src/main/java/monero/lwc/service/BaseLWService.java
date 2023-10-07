package monero.lwc.service;

import monero.lwc.client.BaseLWClient;
import monero.lwc.schema.request.*;
import monero.lwc.schema.response.*;
import monero.lwc.source.BaseLWSource;

public abstract class BaseLWService<SourceType extends BaseLWSource, ClientType extends BaseLWClient> {

    protected SourceType source;

    protected ClientType client;

    protected SourceType getSource()
    {
        return this.source;
    }

    protected abstract GetAddressInfoResponse getAddressInfo(GetAddressInfoRequest requestSchema);

    protected abstract GetAddressTxsResponse getAddressTxs(GetAddressTxsRequest requestSchema);
    protected abstract GetRandomOutsResponse getRandomOuts(GetRandomOutsRequest requestSchema);
    protected abstract GetUnspentOutsResponse getUnspentOuts(GetUnspentOutsRequest requestSchema);
    protected abstract ImportRequestResponse importRequest(ImportRequestRequest requestSchema);
    protected abstract LoginResponse login(LoginRequest requestSchema);
    protected abstract SubmitRawTxResponse submitRawTx(SubmitRawTxRequest requestSchema);

}
