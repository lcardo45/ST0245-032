 import java.util.*;

/**
 *
 * @author 
 */
public class Punto2 {
    public static void cola (){
        Queue<String> queue = new LinkedList<String>();
        queue.add("Cristiano");
        queue.add("Musulman");
        queue.add("Judio");
        while(queue.peek() !=null){
            System.out.println("atendiendo a el " + queue.peek());
            queue.poll();
        }
    }
}