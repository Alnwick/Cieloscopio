package proyects.cieloscopio.Main;

import proyects.cieloscopio.Service.ConviertsData;
import proyects.cieloscopio.Service.UseAPI;

import java.util.Scanner;

public class Main {
    private static final String URL_BASE = "https://api.openweathermap.org/data/2.5/weather?q=";
    private static final String API_KEY = "&appid=0ecf95ec00bd6412a66065236a76294d";
    private static final String URL_COMP = "&units=metric&lang=es";
    private UseAPI useAPI = new UseAPI();
    private ConviertsData conviertsData = new ConviertsData();
    private Scanner scan = new Scanner(System.in);

    public void menu(){

    }
}
