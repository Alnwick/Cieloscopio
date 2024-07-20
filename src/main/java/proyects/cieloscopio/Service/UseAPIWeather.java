package proyects.cieloscopio.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import proyects.cieloscopio.Model.WeatherAPIModel;

import java.io.IOException;

public class UseAPIWeather {
    UseAPI useAPI = new UseAPI();
    GetAPI_KEY getAPI_KEY = new GetAPI_KEY();
    String link;

    public WeatherAPIModel getWeatherAPI(double latitude, double lenght) throws IOException, InterruptedException {
        link = "https://api.openweathermap.org/data/2.5/weather?lat=" + latitude + "&lon=" + lenght + "&appid=" + getAPI_KEY.get()+"&units=metric&lang=es";
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        return gson.fromJson(useAPI.getUseAPI(link), WeatherAPIModel.class);
    }

}