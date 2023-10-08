package monero.lwc;

public abstract class MoneroLWMethod {
    public static final String GetAddressInfo = "get_address_info";
    public static final String GetAddressTxs = "get_address_txs";
    public static final String GetRandomOuts = "get_random_outs";
    public static final String GetUnspentOuts = "get_unspent_outs";
    public static final String ImportRequest = "import_request";
    public static final String Login = "login";
    public static final String SubmitRawTx = "submit_raw_tx";

    public static final String AcceptRequests = "accept_requests";
    public static final String AddAccount = "add_account";
    public static final String ListAccounts = "list_accounts";
    public static final String ListRequests = "list_requests";
    public static final String ModifyAccountStatus = "modify_account_status";
    public static final String RejectRequests = "reject_requests";
    public static final String Rescan = "rescan";
    public static final String Validate = "validate";
    public static final String WebhookAdd = "webhook_add";
    public static final String WebhookDelete = "webhook_delete";
    public static final String WebhookDeleteUUID = "webhook_delete_uuid";
    public static final String WebhookList = "webhook_list";
}
