package proyects.cieloscopio.Main;


import proyects.cieloscopio.Model.GeoModel;
import proyects.cieloscopio.Service.ConvertData;
import proyects.cieloscopio.Service.UseAPI;

import java.util.Scanner;

public class Main {
    private static final String URL_BASE = "http://api.openweathermap.org/geo/1.0/direct?q=";
    private static final String API_KEY = "&appid=0ecf95ec00bd6412a66065236a76294d";
    private static final String URL_COMP = "&limit=1";
    private UseAPI useAPI = new UseAPI();
    private Scanner scan = new Scanner(System.in);
    private ConvertData cdata = new ConvertData();

    public void menu(){
        System.out.println("Ingrese la ciudad: ");
        var ciudad = scan.nextLine();
        var json = useAPI.getData(URL_BASE + ciudad.replace(" ", "+") + API_KEY + URL_COMP);

        System.out.println("Json: " + json);

        var datos = cdata.getData(json, GeoModel.class);
        System.out.println(datos);
    }
}
