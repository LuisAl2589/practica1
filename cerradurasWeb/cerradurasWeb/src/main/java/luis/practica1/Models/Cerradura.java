package luis.practica1.Models;
import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

@Component
public class Cerradura {
    
    public Map<String, String> kleeneCerradura(int n) {
        Map<String, String> response = new HashMap<>();
        StringBuilder kleene = new StringBuilder("{λ}, ");

        for (int i = 1; i <= n; i++) {
            kleene.append(generarBinarios(i)).append(", ");
        }

        response.put("Σ^*", kleene.substring(0, kleene.length() - 2));
        return response;
    }

    public Map<String, String> kleeneClausuraPositiva(int n) {
        Map<String, String> response = new HashMap<>();
        StringBuilder positiva = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            positiva.append(generarBinarios(i)).append(", ");
        }

        response.put("Σ^+", positiva.substring(0, positiva.length() - 2));
        return response;
    }

    private String generarBinarios(int n) {
        return java.util.stream.IntStream.range(0, (int) Math.pow(2, n))
                .mapToObj(i -> String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0'))
                .collect(Collectors.joining(", "));
    }

}
