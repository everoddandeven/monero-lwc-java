package monero.lwc.schema.admin.response;

import monero.lwc.schema.admin.MoneroLWSAddressInfo;
import org.json.JSONObject;

public class ListRequestsResponse extends AdminResponse {
    public MoneroLWSAddressInfo[] toCreate;
    public MoneroLWSAddressInfo[] toImport;

    public ListRequestsResponse(MoneroLWSAddressInfo[] toCreate, MoneroLWSAddressInfo[] toImport)
    {
        this.toImport = toImport;
        this.toCreate = toCreate;
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
