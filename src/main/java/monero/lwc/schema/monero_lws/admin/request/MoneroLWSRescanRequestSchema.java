package monero.lwc.schema.monero_lws.admin.request;

public class MoneroLWSRescanRequestSchema extends MoneroLWSAdminRequestSchema {
    public Long height;
    public String[] addresses;
}
