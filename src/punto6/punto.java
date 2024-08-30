package punto6;

import java.util.Comparator;
import java.util.PriorityQueue;

public class punto {
    public static void main(String[] args) {
        Comparator<Tarea> c=Comparator.comparing(Tarea -> Tarea.b);
        PriorityQueue<Tarea> cola=new PriorityQueue<>(c);

    }


}
