package punto14;

import java.util.List;

public class punto {
    public static List<String> recursiva8(List<String> l,List<String>r){
        if(l.isEmpty()){
            return r;
        }
        String one=l.get(0);

        if(Character.isUpperCase(one.charAt(0))){
            r.add(l.get(0));

        }
        l.remove(0);
        return recursiva8(l,r);
    }
}
