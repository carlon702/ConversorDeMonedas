import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestAPI {
    public ApiResponse conversor (String coin1, String coin2, String quant){
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/31f531e5bf73ebdb5a7d5ac7/pair/"+coin1+"/"+coin2+"/"+quant);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),ApiResponse.class);

        } catch(Exception e){
            throw new RuntimeException("Couldn't process that request");
        }
    }
}
