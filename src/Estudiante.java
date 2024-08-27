import java.util.HashMap;
import java.util.Map;

public class Estudiante extends Persona{
    String noMatricula;

    public String getNoMatricula() {
        return noMatricula;
    }

    public void setNoMatricula(String noMatricula) {
        this.noMatricula = noMatricula;
    }

    //Punto 3
    public static void main(String[] args) {
        Map<String, Estudiante> mapEstudiantes = new HashMap<>();

        Estudiante pepe = new Estudiante();
        pepe.setEdad(10);
        pepe.setGenero(Genero.MASCULINO);
        pepe.setNombre("pepe");
        pepe.setNoMatricula("241242342");

        mapEstudiantes.put(pepe.getNoMatricula(), pepe);

        System.out.println(mapEstudiantes);

    }

}
