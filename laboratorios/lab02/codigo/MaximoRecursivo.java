import java.util.Scanner;
public class MaximoRecursivo {
    static Scanner entrada =  new Scanner (System.in);
    public static void main(String[] args)
    {
        long estimatedTime = 0;
        long startTime = 0;
        //System.currentTimeMillis();
        int t;
        System.out.println("ingrese el tamaño del arreglo: ");
        t = entrada.nextInt();
        int[] array = new int [t];
        for(int i=0; i<array.length; i++){
            array[i] = (int)(Math.random()*1000+0);
            startTime = System.currentTimeMillis();
            System.out.println("Datos: "+ array[i]);
        }
        System.out.println("Mayor: " + Mayor(array, 0, array[0]));
        estimatedTime += System.currentTimeMillis() - startTime ;
        System.out.println("Tiempo: " + estimatedTime);
        }
        
    
 
    static int Mayor(int[] array, int n, int mayor)
    {
        if (n == array.length)
            return mayor;
 
        if (array[n] > mayor)
            mayor = array[n];
 
        return Mayor(array, ++n, mayor);
    }
}