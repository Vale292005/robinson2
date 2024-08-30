package punto10;

import java.util.Queue;

public class punto {
    public static Queue<Productos> recursiva4(Queue<Productos> c,Queue<Productos>r){
        if(c.isEmpty()){
            return r;
        }
        Productos p=c.poll();
        if(p.getV()<10){
            r.add(p);
        }
        return r;
    }
}
