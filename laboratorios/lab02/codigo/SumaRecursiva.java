import java.util.Scanner;
public class SumaRecursiva{
    static Scanner entrada =  new Scanner (System.in);
    
    static int suma(int [] vec, int n){
        if( n == 0 ){
            return vec[n];
        } else
        return vec[n] + suma(vec, n-1);
     }
    public static void main (String[] args) {
        long estimatedTime = 0;
        long startTime = System.currentTimeMillis();
        int n;
        System.out.println("ingrese el valor de n: ");
        n = entrada.nextInt();
        int [] vec = new int[n];
        for(int i = 0; i < n; i++){
            vec [i] = (int) (int)(Math.random()*20+0);
            System.out.println (vec[i] + "\t");
        }                               
        System.out.println("La suma es: " + suma(vec, n-1));
        estimatedTime += System.currentTimeMillis() - startTime ;
        System.out.println(" Tiempo: " + estimatedTime);
    }
}