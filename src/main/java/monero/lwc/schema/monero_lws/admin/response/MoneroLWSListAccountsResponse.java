package monero.lwc.schema.monero_lws.admin.response;

import monero.lwc.schema.monero_lws.admin.MoneroLWSAccountInfo;

public class MoneroLWSListAccountsResponse extends MoneroLWSAdminResponse {
    public MoneroLWSAccountInfo[] active;
    public MoneroLWSAccountInfo[] inactive;
    public MoneroLWSAccountInfo[] hidden;

    public MoneroLWSListAccountsResponse(MoneroLWSAccountInfo[] active, MoneroLWSAccountInfo[] inactive, MoneroLWSAccountInfo[] hidden)
    {
        this.active = active;
        this.inactive = inactive;
        this.hidden = hidden;
    }

    public MoneroLWSListAccountsResponse(MoneroLWSAccountInfo[] active, MoneroLWSAccountInfo[] inactive)
    {
        this(active, inactive, new MoneroLWSAccountInfo[]{});
    }

    public MoneroLWSListAccountsResponse(MoneroLWSAccountInfo[] active)
    {
        this(active, new MoneroLWSAccountInfo[]{}, new MoneroLWSAccountInfo[]{});
    }
}
