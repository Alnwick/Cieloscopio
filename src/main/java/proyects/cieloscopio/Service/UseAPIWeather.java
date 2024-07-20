package proyects.cieloscopio.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import proyects.cieloscopio.Model.WeatherAPIModel;

import java.io.IOException;

public class UseAPIWeather {
    UseAPI useAPI = new UseAPI();

    public WeatherAPIModel getWeatherAPI(String API) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        return gson.fromJson(useAPI.getUseAPI(API), WeatherAPIModel.class);
    }

}