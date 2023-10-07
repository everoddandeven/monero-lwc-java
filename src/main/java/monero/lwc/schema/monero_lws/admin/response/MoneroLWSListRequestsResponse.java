package monero.lwc.schema.monero_lws.admin.response;

import monero.lwc.schema.monero_lws.admin.MoneroLWSAddressInfo;

public class MoneroLWSListRequestsResponse extends MoneroLWSAdminResponse {
    public MoneroLWSAddressInfo[] toCreate;
    public MoneroLWSAddressInfo[] toImport;

    public MoneroLWSListRequestsResponse(MoneroLWSAddressInfo[] toCreate, MoneroLWSAddressInfo[] toImport)
    {
        this.toImport = toImport;
        this.toCreate = toCreate;
    }
}
