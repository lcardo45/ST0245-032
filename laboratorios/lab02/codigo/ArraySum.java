public class ArraySum
{
    public static void suma(int t) 
    { 
        long [] datos = new long [t];
        long suma = datos[0]; 
        long ahora = System.currentTimeMillis();
        long tiempo = 0;
        for(int i=0; i<datos.length; i++){
            datos[i] = (int)(Math.random()*20+0);
            //System.out.println("Datos: "+ datos[i]); 
            suma+=datos[i];          
            //System.out.println("Suma: "+suma);
            long despues = System.currentTimeMillis();
            tiempo = despues - ahora;
            //System.out.println("Tiempo: "+ tiempo);
        }
        System.out.println("Tiempo: "+ tiempo);
    }
}