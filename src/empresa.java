import java.util.Iterator;
import java.util.TreeSet;

public class empresa {
    TreeSet<Productos> productos;

    public Productos buscar_Productos(String codigo){
        Iterator<Productos> iterator = productos.iterator();
        while (iterator.hasNext()){
            Productos p = iterator.next();
            if(p.codigo.equals(codigo)) return p;
        }
        return null;
    }
}
