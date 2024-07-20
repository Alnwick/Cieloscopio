package proyects.cieloscopio.Main;

import proyects.cieloscopio.Model.GeoAPIModel;
import proyects.cieloscopio.Model.WeatherAPIModel;
import proyects.cieloscopio.Model.WeatherModel;
import proyects.cieloscopio.Service.UseAPIGeo;
import proyects.cieloscopio.Service.UseAPIWeather;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DataCity {

    public String getDataCity(String city) throws IOException, InterruptedException{
        String nameCity;
        double currentTemperature;
        double minTemperature;
        double maxTemperature;
        String weatherCondition;
        String dateDay;
        String dateHour;
        int humidity;
        UseAPIGeo useAPIGeo = new UseAPIGeo();
        UseAPIWeather useAPIWeather = new UseAPIWeather();
        WeatherModel[] weatherModel;
        Date dateFull = new Date();

        SimpleDateFormat formatDay = new SimpleDateFormat("dd-MM-yyyy");
        formatDay.setTimeZone(TimeZone.getDefault());
        SimpleDateFormat formatHour = new SimpleDateFormat("hh:mm");
        formatHour.setTimeZone(TimeZone.getDefault());

        GeoAPIModel geoAPIModel = useAPIGeo.getGeoAPI(city);
        System.out.println(geoAPIModel);
        WeatherAPIModel weatherAPIModel = useAPIWeather.getWeatherAPI(geoAPIModel.latitude(), geoAPIModel.length());
        weatherModel = weatherAPIModel.weatherMain();

        System.out.println(weatherAPIModel);
        nameCity = weatherAPIModel.cityName();
        currentTemperature = weatherAPIModel.mainData().temperature();
        minTemperature = weatherAPIModel.mainData().minTemperature();
        maxTemperature = weatherAPIModel.mainData().maxTemperature();
        weatherCondition = weatherModel[0].descWeather();
        dateHour = formatHour.format(dateFull);
        dateDay = formatDay.format(dateFull);
        humidity = weatherAPIModel.mainData().humidity();


        return "\n\nDatos de la ciudad" +
                "\nCiudad: " + nameCity +
                "\nFecha: " + dateDay +
                "\nHora: " + dateHour +
                "\n\nTemperatura actual: " + currentTemperature + " °C" +
                "\nCondicion climatica: " + weatherCondition +
                "\n\nTemperatura maxima: " + maxTemperature + "°C" +
                "\nTemperatura minima: " + minTemperature + "°C" +
                "\nHumedad: " + humidity + "\n\n";
    }
}