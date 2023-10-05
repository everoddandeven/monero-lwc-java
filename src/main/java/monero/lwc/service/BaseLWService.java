package monero.lwc.service;

import monero.lwc.schema.request.*;
import monero.lwc.schema.response.*;
import monero.lwc.source.BaseLWSource;

public abstract class BaseLWService<SourceType extends BaseLWSource> {

    protected SourceType source;

    public SourceType getSource()
    {
        return this.source;
    }

    public abstract GetAddressInfoResponseSchema GetAddressInfo(GetAddressInfoRequestSchema requestSchema);
    public abstract GetAddressTxsResponseSchema GetAddressTxs(GetAddressTxsRequestSchema requestSchema);
    public abstract GetRandomOutsResponseSchema GetRandomOuts(GetRandomOutsRequestSchema requestSchema);
    public abstract GetUnspentOutsResponseSchema GetUnspentOuts(GetUnspentOutsRequestSchema requestSchema);
    public abstract ImportRequestResponseSchema ImportRequest(ImportRequestRequestSchema requestSchema);
    public abstract LoginResponseSchema Login(LoginRequestSchema requestSchema);
    public abstract SubmitRawTxResponseSchema SubmitRawTx(SubmitRawTxRequestSchema requestSchema);

}
