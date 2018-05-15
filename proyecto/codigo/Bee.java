
public class Bee
{
    protected double x; //posicion de la abeja en el eje x;
    protected double y; //posicion de la abeja en el eje y;
    protected boolean crash = false;


   public Bee(double x, double y)
   {
        //constructor de la clase abeja
        this.y = y;
        this.x = x;
   }
   
   public void setTrue(){
       crash = true;
    }
    
   public boolean intersects(Bee bee){
       
       if(!crash){
           double distance = Math.sqrt(Math.pow(bee.x-x,2) + Math.pow(bee.y-y,2));
           if(distance <=5){
               return true;
            }
                   }
       return false;
   }
}
