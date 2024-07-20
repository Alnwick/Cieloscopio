package proyects.cieloscopio.Main;

import proyects.cieloscopio.Model.GeoAPIModel;
import proyects.cieloscopio.Model.WeatherAPIModel;
import proyects.cieloscopio.Model.WeatherModel;
import proyects.cieloscopio.Service.UseAPIGeo;
import proyects.cieloscopio.Service.UseAPIWeather;

import java.io.IOException;
import java.util.Date;

public class DataCity {
    public String getDataCity(String API) throws IOException, InterruptedException{
        String nameCity;
        double currentTemperature;
        double minTemperature;
        double maxTemperature;
        String weatherCondiciton;
        Date dateDay;
        Date dateHour;
        int humidity;
        UseAPIGeo useAPIGeo = new UseAPIGeo();
        UseAPIWeather useAPIWeather = new UseAPIWeather();
        WeatherModel weatherModel[];



        GeoAPIModel geoAPIModel = useAPIGeo.getGeoAPI(API);
        WeatherAPIModel weatherAPIModel = useAPIWeather.getWeatherAPI(API);

        //Concluir
        return "";
    }
}