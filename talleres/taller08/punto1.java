import java.util.*;
/**
 *
 * @author 
 */
public class punto1 {
    public static void pila (){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        Stack<Integer> pila2 = new Stack<Integer>();
        
        while(!stack.isEmpty()){
            System.out.println(pila2.push(stack.pop()));
        }
    }
}
