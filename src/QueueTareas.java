import java.util.PriorityQueue;

// Punto 6
public class QueueTareas {

    PriorityQueue<Tarea> queue;

    public QueueTareas() {
        this.queue = new PriorityQueue<>();
    }

    public void enqueue(Tarea tarea){
        queue.add(tarea);
    }

    public Tarea dequeue(){
        return queue.poll();
    }
}
