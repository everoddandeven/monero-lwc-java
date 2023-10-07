package monero.lwc.schema.monero_lws.admin.response;

import monero.lwc.schema.monero_lws.admin.MoneroLWSAccountInfoSchema;

public class MoneroLWSListAccountsResponseSchema extends MoneroLWSAdminResponseSchema {
    public MoneroLWSAccountInfoSchema[] active;
    public MoneroLWSAccountInfoSchema[] inactive;
    public MoneroLWSAccountInfoSchema[] hidden;
}
