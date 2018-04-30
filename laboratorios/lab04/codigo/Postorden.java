import java.util.*;
/**
 * Write a description of class Postorden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Postorden
{
    List<Integer> numeros = new ArrayList<Integer>();

    public Postorden()
    {
        Scanner reader = new Scanner(System.in);
        int numero = 0;
 
        System.out.println("Introduce números. El cero para salir");
 
        do {			
            try {
                numero = reader.nextInt();
                numeros.add(numero);
            } catch (InputMismatchException ime){
                System.out.println("¡Cuidado! Solo puedes insertar números. ");
                reader.next();
            }
        } while (numero!=0);
    }
    public void convertir()
    {
        Arbol Punto2 = new Arbol();
        for(int i = 0; i<numeros.size();i++){
            Punto2.insertar(numeros.get(i));
        }
        Punto2.postOrder(Punto2.raiz);
    }
}   

