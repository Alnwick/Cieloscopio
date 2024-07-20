package proyects.cieloscopio.Main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public void menu() throws IOException, InterruptedException {
        DataCity dataCity = new DataCity();
        int response;
        Scanner scanOne = new Scanner(System.in);
        Scanner scanTwo = new Scanner(System.in);

        do{
            System.out.println(
                    "\n-------MENU CIELOSCOPIO-------" +
                            "\n1. Ciudad de Mexico" +
                            "\n2. Bogota" +
                            "\n3. Buenos Aires" +
                            "\n4. Monterrey" +
                            "\n5. Washington" +
                            "\n6. Escoger ciudad" +
                            "\n7. Salir" +
                            "\nSeleccione opcion: ");
            response = scanOne.nextInt();

            switch(response){
                case 1:
                    System.out.println(dataCity.getDataCity("Ciudad de Mexico"));
                    break;
                case 2:
                    System.out.println(dataCity.getDataCity("Bogota"));
                    break;
                case 3:
                    System.out.println(dataCity.getDataCity("Buenos Aires"));
                    break;
                case 4:
                    System.out.println(dataCity.getDataCity("Monterrey"));
                    break;
                case 5:
                    System.out.println(dataCity.getDataCity("Washington"));
                    break;
                case 6:
                    System.out.println("\nEscriba la ciudad: ");
                    String city = scanTwo.nextLine();
                    try {
                        System.out.println(dataCity.getDataCity(city));
                    }catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
                        System.out.println("Datos no encontrados o ciudad no existente.");
                    }
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
