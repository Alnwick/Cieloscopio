package proyects.cieloscopio.Model;

import com.google.gson.JsonObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CityData {
    private String city;
    private String date;
    private String time;
    private double nowTemperature;
    private String climatCondition;
    private double maxTemperature;
    private double minTemperature;

    public CityData(JsonObject jsonObject) {
        LocalDateTime localDateTime = LocalDateTime.now();

        this.city = jsonObject.get("name").getAsString();
        this.nowTemperature = jsonObject.getAsJsonObject("main").get("temp").getAsDouble();
        this.climatCondition = jsonObject.getAsJsonObject("weather").get("description").getAsString();
        this.maxTemperature = jsonObject.getAsJsonObject("main").get("temp_max").getAsDouble();
        this.minTemperature = jsonObject.getAsJsonObject("main").get("temp_min").getAsDouble();

        this.date = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.time = localDateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    @Override
    public String toString() {
        return "Ciudad: " + city + "/n" +
                "Fecha: " + date + "/n" +
                "Hora: " + time + "/n" +
                "/n"+
                "Temperatura actual: " + nowTemperature + "/n" +
                "Condicion climatica: " + climatCondition + "/n" +
                "/n" +
                "Temperatura minima: " + minTemperature + "/n" +
                "Temperatura maxima: " + maxTemperature + "/n";
    }
}



