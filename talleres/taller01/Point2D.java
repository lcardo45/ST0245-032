
/**
 * 
 * Luis Felipe Cardona Ramirez
 * Federico Banoy Restrepo
 * 
 */
public class Point2D
{
    //Esta clase es similar al juego de las naves y las bombas realizado en clase.
    private int x;
    private int y;
    //Este es el constructor de la clase Point2D, el cual recibe como parametros las coordenads x,y
    public Point2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    //El radio equivale a la raiz cuadrada de la suma de cada una de las coordenadas al cuadrado
    public double radius()
    {
        return Math.sqrt(x*x + y*y);
    }
    
    //Este método calcula ángulo, el cual es la tangente inversa de la coordenada en y sobre x
    public double angle()
    {
        return Math.atan2(y,x); 
    }
    
    //Este método recibe como parametro otro punto, lo que se hace es calcular la distancia entre ellos.
    public double distance (Point2D punto)
    {
        return Math.sqrt ( Math.pow(x-punto.x,2) + Math.pow(y-punto.y,2));
    }
}
