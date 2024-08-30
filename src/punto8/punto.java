package punto8;

import java.util.HashMap;
import java.util.Map;

public class punto {
    public Map<Integer,String> recursiva2 (Map<Integer,String>m,Map<Integer,String>pares){
        if(m.isEmpty()){
            return new HashMap<>();
        }
        Map.Entry<Integer,String> cent=m.entrySet().iterator().next();
        if(cent.getKey() %2==0){
            pares.put(cent.getKey(),cent.getValue());
            m.remove(cent.getKey());
        }
        return recursiva2 (m,pares);
    }
}
