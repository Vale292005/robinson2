package punto12;

import java.util.ArrayList;
import java.util.List;

public class punto {
    public static List<Integer> recursiva6(Nodo n){
        List<Integer>r=new ArrayList<>();
        if(n==null){
            return r;
        }
        r.addAll(recursiva6(n.izq));
        r.add(n.v);
        r.addAll(recursiva6(n.der));

        return r;
    }
}
