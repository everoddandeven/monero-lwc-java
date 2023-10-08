import monero.lwc.MoneroLWClient;

public class Test {
    public static void main(String[] args) {
        try {
            MoneroLWClient client = new MoneroLWClient("https://127.0.0.1:8443");
            System.out.print("OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
