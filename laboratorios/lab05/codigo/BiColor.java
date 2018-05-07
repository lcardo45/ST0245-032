import java.util.*;
/**
 * Write a description of class Postorden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BiColor
{
    List<Integer> numeros = new ArrayList<Integer>();
    private int size;
    private int numeroDeArcos;
    private int[][] matriz;
    private int[] BicolorMatriz;
    private int size()
    {
        Scanner reader = new Scanner(System.in);
        size = 0;
 
        System.out.println("Introduce el número de nodos y el cero para salir");
        
            try {
                size = reader.nextInt();
                
            } catch (InputMismatchException ime){
                System.out.println("¡Cuidado! Solo puede insertar números. ");
                reader.next();
            }
        matriz = new int [size][size];
        BicolorMatriz = new int [size];
        return size;
    }
    private void Arcos()
    {
        Scanner reader = new Scanner(System.in);
        numeroDeArcos = 0;
 
        System.out.println("introdusca el numero de relaciones");
 
                    
            try {
                numeroDeArcos = reader.nextInt();
                
            } catch (InputMismatchException ime){
                System.out.println("¡Cuidado! Solo puede insertar números. ");
                reader.next();
            }
        
            for(int i=0;i<=numeroDeArcos-1;i++){
                int primerNodo=0;
                int segundoNodo=0;
                System.out.println("introdusca el nodo que quiere relacionar");
                Scanner reader1 = new Scanner(System.in);
                try {
                     primerNodo = reader1.nextInt();
                
                } catch (InputMismatchException ime){
                    System.out.println("¡Cuidado! Solo puede insertar números. ");
                    reader.next();
                }
                System.out.println("Este nodo se relaciona con:");
                Scanner reader2 = new Scanner(System.in);
                try {
                     segundoNodo = reader2.nextInt();
                
                } catch (InputMismatchException ime){
                    System.out.println("¡Cuidado! Solo puede insertar números. ");
                    reader.next();
                } 
                matriz[primerNodo][segundoNodo] = 1;
                matriz[segundoNodo][primerNodo] = 1;
            }
    }
        private boolean Bicolor()
    {
        boolean Bicolor = true;
        for(int k=0; k<=size-1; k++){
            BicolorMatriz[k] = 0;
        }
          for(int i = 0; i<=size-1 ;i++){
              for(int j = 0; j<=size-1 ;j++){
                  if(matriz[i][j] == 1){
                     if(BicolorMatriz [i] == 0 && BicolorMatriz [j] == 0){
                         BicolorMatriz [i] = 1;
                         BicolorMatriz [j] = 2;
                     }
                     if(BicolorMatriz [i] == 1 && BicolorMatriz [j] == 0){
                         BicolorMatriz [j] = 2;
                     }
                     if(BicolorMatriz [i] == 2 && BicolorMatriz [j] == 0){
                         BicolorMatriz [j] = 1;
                     }
                     if(BicolorMatriz [i] == 0 && BicolorMatriz [j] == 1){
                         BicolorMatriz [i] = 2;
                     }
                     if(BicolorMatriz [i] == 0 && BicolorMatriz [j] == 2){
                         BicolorMatriz [i] = 1;
                     }
                     if((BicolorMatriz [i] == BicolorMatriz [j] ) && BicolorMatriz [j] != 0){
                         Bicolor = false;
                     }                  
                  }
              }
          }
          if(Bicolor ==false){
              System.out.println("NO SE PUEDE BICOLOR");
          }else{
              System.out.println("SE PUEDE BICOLOR");
          }
        return Bicolor;
    }
    public void analizar(){
        do {			
            size();
            if(size == 0){
               break;
            }
            Arcos();
            Bicolor();
        } while (size!=0);
    }
}  
