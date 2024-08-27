import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Persona> objetos=new ArrayList<>();

        HashSet<String> elementos = new HashSet<String>();

    }
    public static void imprimir(HashSet<String> a){
        Iterator<String> b=a.iterator();
        while(b.hasNext()){
            System.out.println(b.next());
        }
    }

}

