public class fibonacci {
    private int x;
    public static long fibonacci(int x)
    {
        if (x<=1){
            return x;
        }else{    
            return fibonacci (x-1) + fibonacci(x-2);
        }
    }
    public static long time(){
        long estimatedTime = 0;
        int n = (int)(Math.random()*50+0);
        for(int i = 0; i < n ; i++){
            long startTime = System.currentTimeMillis();    
            fibonacci(i);                 
            estimatedTime += System.currentTimeMillis() - startTime ;
            System.out.println("Posición: "+ i + " Tiempo: " + estimatedTime);
        }
        return estimatedTime;
    }
}