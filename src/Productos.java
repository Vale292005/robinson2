public class Productos implements Comparable<Productos> {
    String nompre;
    String codigo;
    @Override
    public int compareTo(Productos o) {
        return codigo.compareTo(o.codigo);
    }
}
