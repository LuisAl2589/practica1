package luis.practica1.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "luis.practica1")  // Asegura el escaneo de componentes
public class Practica1Application {

    public static void main(String[] args) {
        SpringApplication.run(Practica1Application.class, args);
    }
}

