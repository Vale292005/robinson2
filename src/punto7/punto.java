package punto7;

import java.util.ArrayList;

public class punto {
    ArrayList<Persona>mayores=new ArrayList<>();

    public void recursiva(ArrayList<Persona>p,ArrayList<Persona>mayores) {
        Persona cent=p.get(0);
        if(p.isEmpty()){
            return new ArrayList<String>();
        }
        if(cent.getE()>=18){
            mayores.add(cent);
            p.remove(0);
        }
        return recursiva(p,mayores);

    }

}
