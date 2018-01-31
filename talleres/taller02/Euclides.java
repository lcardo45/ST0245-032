 //@author Federico Banoy
public class Euclides
{
    private int x;
    private int y;
    //Constructor del algoritmo
    public Euclides(int a,int b)
    {
        x=a;
        y=b;
    }
    public static int gcd(int a, int b) 
    {
       if(a==0 && b== 0){
        return 9999999;
       }else if(b==0){
        return a;
       } else {
        return gcd(b, a % b);
       }
    }
}
