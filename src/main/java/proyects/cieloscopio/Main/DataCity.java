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
        WeatherAPIModel weatherAPIModel = useAPIWeather.getWeatherAPI(geoAPIModel.lat(), geoAPIModel.lon());
        weatherModel = weatherAPIModel.weather();

        nameCity = geoAPIModel.name();
        currentTemperature = weatherAPIModel.main().temp();
        minTemperature = weatherAPIModel.main().temp_min();
        maxTemperature = weatherAPIModel.main().temp_max();
        weatherCondition = weatherModel[0].description();
        dateHour = formatHour.format(dateFull);
        dateDay = formatDay.format(dateFull);
        humidity = weatherAPIModel.main().humidity();


        return "\nDatos de la ciudad" +
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