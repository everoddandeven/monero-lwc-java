package monero.lwc.service.monero_lws.auth;

public class MoneroLWSAuthService {

    private static MoneroLWSAuthService authService;

    private String hash;

    private MoneroLWSAuthService(String hash)
    {
        this.hash = hash;
    }

    private MoneroLWSAuthService()
    {
        this.hash = "";
    }

    public void setHash(String hash)
    {
        this.hash = hash;
    }

    public String getHash()
    {
        return this.hash;
    }

    public static MoneroLWSAuthService getInstance()
    {
        if (MoneroLWSAuthService.authService == null)
        {
            MoneroLWSAuthService.authService = new MoneroLWSAuthService();
        }

        return MoneroLWSAuthService.authService;
    }

    public static void setInstanceHash(String hash)
    {
        if (MoneroLWSAuthService.authService == null)
        {
            MoneroLWSAuthService.authService = new MoneroLWSAuthService();
        }

        MoneroLWSAuthService.authService.setHash(hash);
    }

    public static String getInstanceHash()
    {
        if (MoneroLWSAuthService.authService == null)
        {
            return "";
        }

        return MoneroLWSAuthService.authService.getHash();
    }
}
