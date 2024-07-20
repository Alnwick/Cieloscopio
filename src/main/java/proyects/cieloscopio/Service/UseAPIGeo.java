package proyects.cieloscopio.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import proyects.cieloscopio.Model.GeoAPIModel;

import java.io.IOException;

public class UseAPIGeo {
    UseAPI useAPI = new UseAPI();
    GetAPI_KEY getAPIKey= new GetAPI_KEY();
    String link;

    public GeoAPIModel getGeoAPI(String city) throws IOException, InterruptedException {
        link = "http://api.openweathermap.org/geo/1.0/direct?q=" + city.replace(" ","+") + "&limit=1&appid=" + getAPIKey.get();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.println(link);
        System.out.println(gson);

        var cities = gson.fromJson(useAPI.getUseAPI(link), GeoAPIModel[].class);
        System.out.println(cities[0]);
        return cities[0];
    }

}
