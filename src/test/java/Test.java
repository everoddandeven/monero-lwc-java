import monero.lwc.MoneroLWClient;

import javax.net.ssl.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

public class Test {
    public static void main(String[] args) {
        try {
            MoneroLWClient client = new MoneroLWClient("http://51.20.136.106:8443");
            client.login(
                    "48LpcQpkHFnM9cE6889P4edZXTgsZrbEZSHdvvdsGGPC8UKwWXsgJmNBMikzX9LpnL8DuuZkjubWtcvmDmYT3MNoQwJzSKe",
                    "778b80fb2b61e106de84363a6188fbf938e4346b5f4b55a103227e4f9d277b0d");
            System.out.print("OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static
    {
        disableSslVerification();
    }

    private static void disableSslVerification() {
        try
        {
            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
            };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
    }
}
