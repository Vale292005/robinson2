package punto15;
import java.util.HashMap;
import java.util.Map;
public class punto {
    public static Map<String, Integer> filtrarPorClaveMinuscula(Map<String, Integer> mapa) {
        return filtrarPorClaveMinusculaRecursivo(new HashMap<>(mapa), new HashMap<>());
    }

    private static Map<String, Integer> filtrarPorClaveMinusculaRecursivo(Map<String, Integer> mapa, Map<String, Integer> resultado) {
        if (mapa.isEmpty()) {
            return resultado;
        }

        Map.Entry<String, Integer> entrada = mapa.entrySet().iterator().next();

        mapa.remove(entrada.getKey());

        if (!entrada.getKey().isEmpty() && Character.isLowerCase(entrada.getKey().charAt(0))) {
            resultado.put(entrada.getKey(), entrada.getValue());
        }


        return filtrarPorClaveMinusculaRecursivo(mapa, resultado);
    }
}
