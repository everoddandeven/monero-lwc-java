package monero.lwc.schema.admin.response;

import monero.lwc.schema.admin.AdminAccountInfo;
import org.json.JSONObject;

public class ListAccountsResponse extends AdminResponse {
    public AdminAccountInfo[] active;
    public AdminAccountInfo[] inactive;
    public AdminAccountInfo[] hidden;

    public ListAccountsResponse(AdminAccountInfo[] active, AdminAccountInfo[] inactive, AdminAccountInfo[] hidden)
    {
        this.active = active;
        this.inactive = inactive;
        this.hidden = hidden;
    }

    public ListAccountsResponse(AdminAccountInfo[] active, AdminAccountInfo[] inactive)
    {
        this(active, inactive, new AdminAccountInfo[]{});
    }

    public ListAccountsResponse(AdminAccountInfo[] active)
    {
        this(active, new AdminAccountInfo[]{}, new AdminAccountInfo[]{});
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
