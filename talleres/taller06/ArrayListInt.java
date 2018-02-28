import java.util.*;
/** 
 * @autor Federico Banoy, Felipe Cardona
 */
public class ArrayListInt{
    private int tamaño;
    private static final int DEFAULT_CAPACITY = 10;
    private int elementos[];
    public ArrayListInt(){
        this.tamaño = 0;
        this.elementos = new int[DEFAULT_CAPACITY];
    }
    public int tamaño(){
        return tamaño;
    }
    public void add(int e){
        if(elementos.length == tamaño){
            int b[] = new int[DEFAULT_CAPACITY * 2];
            for(int i = 0; i < elementos.length ; i++)
                b[i] = elementos[i];
            elementos = b;
        }
        elementos[tamaño+1] = e;
    }
    public int get(int i){
        if(i < 0 || i > tamaño)
            throw new ArithmeticException("Fuera del limite");
            return this.elementos[i];
    }
    public void add(int index, int n){
    if(index < 0 || index > tamaño)
        throw new ArithmeticException("fuera del limite");   
    if(elementos.length == tamaño){
        int b[] = new int[DEFAULT_CAPACITY * 2];
        for(int i = 0; i < elementos.length ; i++)
        b[i] = elementos[i];
        elementos = b;
    }
    for(int i = elementos.length; i > index; i--)
        elementos[i] = elementos[i-1];
    elementos[index] = n;
   
    }
}