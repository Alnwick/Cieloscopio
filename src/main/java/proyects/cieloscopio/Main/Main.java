package proyects.cieloscopio.Main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public void menu() throws IOException, InterruptedException {
        DataCity dataCity = new DataCity();
        int response;
        Scanner scan= new Scanner(System.in);

        do{
            System.out.println(
                    "\n\n-------MENU CIELOSCOPIO-------" +
                            "\n1. Ciudad de Mexico" +
                            "\n2. Bogota" +
                            "\n3. Buenos Aires" +
                            "\n4. Monterrey" +
                            "\n5. Washington" +
                            "\n6. Escoger ciudad" +
                            "\n7. Salir");
            response = scan.nextInt();

            switch(response){
                case 1:
                    dataCity.getDataCity("Ciudad de Mexico");
                    break;
                case 2:
                    dataCity.getDataCity("Bogota");
                    break;
                case 3:
                    dataCity.getDataCity("Buenos Aires");
                    break;
                case 4:
                    dataCity.getDataCity("Monterrey");
                    break;
                case 5:
                    dataCity.getDataCity("Washington");
                    break;
                case 6:
                    System.out.println("\nEscriba la ciudad: ");
                    String city = scan.nextLine();
                    dataCity.getDataCity(city);
                    break;
                case 7:
                    System.out.println("Cerrando cieloscopio...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(response != 7);
    }
}
