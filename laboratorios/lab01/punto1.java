public class punto1 {
    public static int punto1(int t)
    {
        int [] x = new int [t];
        int sum = 0;
        for(int i=0; i<x.length; i++){
            x[i] = (int)(Math.random()*20+0);
            System.out.println(x[i]); 
            sum = sum + x[i];
        }
        
        return sum;
    
    }
    public static int punto2(int t)
    {
        int [] x = new int [t];
        int y = x[0];
        for(int i=0; i<x.length; i++){
            x[i] = (int)(Math.random()*20+0);
            System.out.println(x[i]); 
            if (x[i] > y){
                y= x[i];
            }
        }
        return y;
    }
    private int x;
     public static long punto3(int x)
    {
        if (x<=1){
            return x;
        }else{    
            return punto3 (x-1) + punto3(x-2);
        }
    }
}