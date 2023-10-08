package monero.lwc.client;

import monero.lwc.schema.request.BaseLWSRequest;
import monero.lwc.schema.response.BaseLWSResponse;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseRestClient {

    protected String baseUrl;

    public BaseRestClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    protected URL buildAPIMethodURL(String apiMethod) throws MalformedURLException {
        return new URL(this.baseUrl + apiMethod);
    }

    protected HttpURLConnection getConnection(String method) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) this.buildAPIMethodURL(method).openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        return connection;
    }

    public <T extends BaseLWSResponse, V extends BaseLWSRequest> T post(String apiMethod, V requestSchema) throws IOException {
        return T.fromJSON(this.post(apiMethod, requestSchema.toJSON()));
    }

    protected JSONObject post(String apiMethod, JSONObject requestBody) throws IOException {
        HttpURLConnection connection = this.getConnection(apiMethod);

        try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
            outputStream.write(requestBody.toString().getBytes("UTF-8"));
        }

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                connection.disconnect();

                return new JSONObject(response.toString());
            }
        }
        else
        {
            connection.disconnect();
            throw new IOException("HTTP Status: " + responseCode);
        }
    }

}
