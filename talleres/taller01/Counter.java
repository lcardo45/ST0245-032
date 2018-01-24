
/**
 *  * Luis Felipe Cardona Ramirez
 *  * Federico Banoy Restrepo
 * 
 */
public class Counter {
    private String id;
    private int incremento;
    private int contadorIncremento = 0;
    
    
    public Counter(String id)
    {
	this.id = id;
    }
    
    //Este metodo recibe como parametro un incremento y lo que hace es que cada que se llama a este método se le suma el incremento.
    //A su vez este támbien cuenta cada que se llama a este método.
    public void increment (int incremento)
    {
	this.incremento += incremento;
	contadorIncremento++;
    }
    
    //Este método es otra versión de increment con la unica diferencia que lo que hace es incrementar en una unidad, el incremento que inicialmente
    //fue pasado como parametro
    public void increment ()
    {
        increment(1);
        contadorIncremento++;
    }    
    
    //Este método retorna la cantidad de veces que ha sido llamado el metodo increment, ya sea el que aumenta en uno o en la misma cantidad del incremento.
    public int tally()
    { 
        return contadorIncremento; 
    }
    
    //Este método toString nos muestra la cantidad de veces que se ha incrementado y en cuanto va el resultado del incremento
    public String toString()
    {
	return "Se ha incrementando "+contadorIncremento+" veces y el incremento va en "+incremento;   
    }
}
