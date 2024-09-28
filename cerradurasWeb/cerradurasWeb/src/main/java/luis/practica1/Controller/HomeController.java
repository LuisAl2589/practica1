package luis.practica1.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import luis.practica1.Models.Cerradura;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private Cerradura cerradura;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/cerradura/kleene/{number}")
    @ResponseBody
    public Map<String, String> cerraduraKleene(@PathVariable("number") int number) {

        if (number < 0) {
            return Map.of("error", "El número no puede ser negativo.");
        }

        return cerradura.kleeneCerradura(number);
    }

    @RequestMapping("/cerradura/positiva/{number}")
    @ResponseBody
    public Map<String, String> cerraduraPositiva(@PathVariable("number") int number) {

        if (number < 0) {
            return Map.of("error", "El número no puede ser negativo.");
        }

        return cerradura.kleeneClausuraPositiva(number);
    }
}
