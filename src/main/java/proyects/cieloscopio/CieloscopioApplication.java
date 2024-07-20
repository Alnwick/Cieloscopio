package proyects.cieloscopio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import proyects.cieloscopio.Main.Main;

@SpringBootApplication
public class CieloscopioApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CieloscopioApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Main main = new Main();
        main.menu();
    }
}
