package monero.lwc.schema.monero_lws.admin.response;

import monero.lwc.schema.monero_lws.admin.MoneroLWSAddressInfoSchema;

public class MoneroLWSListRequestsResponseSchema extends MoneroLWSAdminResponseSchema {
    public MoneroLWSAddressInfoSchema[] toCreate;
    public MoneroLWSAddressInfoSchema[] toImport;
}
