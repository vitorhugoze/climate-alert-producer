package org.apllication.climate;


import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apllication.climate.dto.CurrentClimateDTO;

public class CurrentClimateIntegration {

    private static final Gson gson = new Gson();
    private static final String BASE_URL = "https://weather.googleapis.com/v1/currentConditions:lookup";
    private static final String API_KEY = System.getenv("GOOGLE_CLIMATE_API_KEY");

    public static CurrentClimateDTO requestCurrentClimate(String latitude, String longitude) throws Exception {
        OkHttpClient client = new OkHttpClient();

        if (API_KEY == null || API_KEY.isEmpty()) {
            throw new Exception("GOOGLE_CLIMATE_API_KEY key is not set.");
        }

        String url = String.format(BASE_URL + "?key=%s&location.latitude=%s&location.longitude=%s", API_KEY, latitude, longitude);

        Request request = new Request.Builder().url(url).build();
        try(Response response = client.newCall(request).execute()) {
            ResponseBody body = response.body();
            if (body == null) {
                throw new Exception("Response body is null");
            }

            String jsonResponse = body.string();
            return gson.fromJson(jsonResponse, CurrentClimateDTO.class);
        }
    }
}
