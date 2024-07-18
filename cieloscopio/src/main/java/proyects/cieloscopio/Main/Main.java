package proyects.cieloscopio.Main;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import proyects.cieloscopio.Model.CityData;
import proyects.cieloscopio.Service.UseAPI;

import java.util.Scanner;

public class Main {
    private static final String URL_BASE = "https://api.openweathermap.org/data/2.5/weather?q=";
    private static final String API_KEY = "&appid=0ecf95ec00bd6412a66065236a76294d";
    private static final String URL_COMP = "&units=metric&lang=es";
    private UseAPI useAPI = new UseAPI();
    private Scanner scan = new Scanner(System.in);
    CityData cityData;

    public void menu(){
        System.out.println("Ingrese la ciudad: ");
        var ciudad = scan.nextLine();
        var json = useAPI.getData(URL_BASE + ciudad.replace(" ", "+") + API_KEY + URL_COMP);
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

        System.out.println(jsonObject);

        cityData = new CityData(jsonObject);
        cityData.toString();
    }
}
