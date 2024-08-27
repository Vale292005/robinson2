public class Tarea implements Comparable<Tarea>{

    private String descripcion;
    private Integer prioridad; // Prioridad de la tarea (mayor valor, mayor prioridad)

    public Tarea(String descripcion, Integer prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tarea o) {
        return this.prioridad.compareTo(o.getPrioridad());
    }


}
