package punto9;

import java.util.Stack;

public class punto {
    public static Stack<Integer>recursiva3(Stack<Integer>p,Stack<Integer>r){
        if(p.isEmpty()){
            return new Stack<>();
        }
        Integer cent=p.pop();
        if(cent>5){
            r.push(cent);
        }
        return recursiva3(p,r);
    }
}
