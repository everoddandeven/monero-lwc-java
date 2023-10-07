package monero.lwc.schema.monero_lws.admin.response;

import monero.lwc.schema.monero_lws.admin.MoneroLWSAccountInfo;

public class MoneroLWSListAccountsResponse extends MoneroLWSAdminResponse {
    public MoneroLWSAccountInfo[] active;
    public MoneroLWSAccountInfo[] inactive;
    public MoneroLWSAccountInfo[] hidden;
}
