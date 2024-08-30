package punto16;
import java.util.Stack;
import java.util.function.Predicate;

public class punto {
    public static <T> Stack<T> filtrarPila(Stack<T> pila, Predicate<T> condicion) {
        return filtrarPilaRecursivo(pila, condicion, new Stack<>());
    }

    private static <T> Stack<T> filtrarPilaRecursivo(Stack<T> pila, Predicate<T> condicion, Stack<T> resultado) {
        // Caso base: si la pila está vacía, devolver la pila resultado
        if (pila.isEmpty()) {
            return resultado;
        }

        // Tomar el elemento en la parte superior de la pila
        T elemento = pila.pop();

        // Llamada recursiva con el resto de la pila
        Stack<T> pilaFiltrada = filtrarPilaRecursivo(pila, condicion, resultado);

        // Si el elemento cumple la condición, agregarlo a la pila resultado
        if (condicion.test(elemento)) {
            pilaFiltrada.push(elemento);
        }

        return pilaFiltrada;
    }
}
