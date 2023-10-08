package monero.lwc.schema.admin.response;

import monero.lwc.schema.admin.AccountInfo;
import org.json.JSONObject;

public class ListAccountsResponse extends AdminResponse {
    public AccountInfo[] active;
    public AccountInfo[] inactive;
    public AccountInfo[] hidden;

    public ListAccountsResponse(AccountInfo[] active, AccountInfo[] inactive, AccountInfo[] hidden)
    {
        this.active = active;
        this.inactive = inactive;
        this.hidden = hidden;
    }

    public ListAccountsResponse(AccountInfo[] active, AccountInfo[] inactive)
    {
        this(active, inactive, new AccountInfo[]{});
    }

    public ListAccountsResponse(AccountInfo[] active)
    {
        this(active, new AccountInfo[]{}, new AccountInfo[]{});
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
