public class maxNoRecursivo {
    public static int punto2(int t)
    {
        int [] x = new int [t];
        int y = x[0];
        long estimatedTime = 0;
        
        for(int i=0; i<x.length; i++){
            long startTime = System.currentTimeMillis();
            x[i] = (int)(Math.random()*1000+0);
            //System.out.println(x[i]); 
            if (x[i] > y){
                y= x[i];
            }
            estimatedTime += System.currentTimeMillis() - startTime ;
            //System.out.println("Tiempo: " + estimatedTime);
        }
         System.out.println("Tiempo: " + estimatedTime);
        return y;
        }
    }