package proyects.cieloscopio.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import proyects.cieloscopio.Model.GeoAPIModel;

import java.io.IOException;

public class UseAPIGeo {
    UseAPI useAPI = new UseAPI();

    public GeoAPIModel getGeoAPI(String API) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        var cities = gson.fromJson(useAPI.getUseAPI(API), GeoAPIModel[].class);

        return cities[0];
    }

}
