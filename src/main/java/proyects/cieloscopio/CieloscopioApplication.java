package proyects.cieloscopio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import proyects.cieloscopio.Main.Main;

import java.io.IOException;

@SpringBootApplication
public class CieloscopioApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CieloscopioApplication.class, args);
    }

    @Override
    public void run(String... args) throws IOException, InterruptedException {
        Main main = new Main();
        main.menu();
    }
}
