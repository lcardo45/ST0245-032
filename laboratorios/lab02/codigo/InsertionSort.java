public class InsertionSort {
      public static long time(int t)    {
         int [] a = new int [t];
         int j;
          long tiempo = 0;
          long tiempoT = 0;
        for(int i = 0; i<a.length; i++){
            long ahora = System.currentTimeMillis();
            a[i]= (int)(Math.random()*10);
            int b = a[i];
            for (j=i -1; j >= 0 && a[j] > b; j--) {  
                a[j + 1] = a[j];  
            }  
             a[j+1] = b;
            long despues = System.currentTimeMillis();
            tiempo = despues - ahora;
            tiempoT = tiempoT + tiempo;
            System.out.println("variable: "+i +" tiempo:  "+ tiempoT +" Datos: "+a[i]);
        }
        return tiempo;
    }
}