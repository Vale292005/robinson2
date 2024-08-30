package punto13;

import java.util.HashSet;
import java.util.Set;

public class punto {
    public static Set<Integer> filtrarPares(Set<Integer> conjunto) {
        if (conjunto.isEmpty()) {
            return new HashSet<>();
        }
        Integer[] array = conjunto.toArray(new Integer[0]);
        Set<Integer> pares = new HashSet<>();

        filtrarParesRecursivo(array, 0, pares);

        return pares;
    }

    private static void filtrarParesRecursivo(Integer[] array, int index, Set<Integer> pares) {
        if (index >= array.length) {
            return;
        }
        if (array[index] % 2 == 0) {
            pares.add(array[index]);
        }
        filtrarParesRecursivo(array, index + 1, pares);
    }
}
