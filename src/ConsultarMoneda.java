import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public RespuestaApi buscarMoneda(String monedaBase, String monedaTarget) {
        String apiKey = "f391111f8a47987fdca987dc";
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaBase + "/" + monedaTarget;
        URI direccion = URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), RespuestaApi.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener datos de la API: " + e.getMessage());
        }
    }
}


