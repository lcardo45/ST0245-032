/**
 *  * Luis Felipe Cardona Ramirez
 *  * Federico Banoy Restrepo
 */

public class Fecha
{
    private byte dia;
    private byte mes;
    private short anyo;
    
    
    
   public Fecha( byte dia, byte mes, short anyo)
    {
	this.dia = dia;
	this.mes = mes;
	this.anyo = anyo;
    }
    
    //Este es un método boleano que revisa si las dos fechas son iguales.
    public boolean equals(Fecha fecha1)
    {
	if(dia == fecha1.dia && mes == fecha1.mes && anyo == fecha1.anyo)
	    {
		return true;
	    }
	return false; 
    }
    
    //Este método retorna la fecha que se paso como parametro.
    public String toString(){
	return "la fecha "+dia+" de "+mes+" del año "+anyo;
    }
    
    //Este método main imprime si las dos fechas son iguales, o cual es mayor o menor que la otra(Recibe como parametro una fecha).
    public void main(Fecha fecha1){
	//Aca se utiliza el método equals para verificar si las dos fechas son iguales.
	if(this.equals(fecha1))
	    {
		System.out.println(toString() + " son iguales");
	    }
	//Este condicional verifica si los años son iguales.
	else if( fecha1.anyo == anyo)
	    {
		//Este condicional verifica si los meses son iguales.
		if( fecha1.mes == mes)
		    {
			//Estos condicionales verifican cual día es menoro mayor que cual
			if(fecha1.dia < dia)
			    { 
				System.out.println(toString() + " es despúes de "+fecha1.toString());
			    }else  System.out.println(toString() + " es antes de "+fecha1.toString());
		    }
		//Estos condicionales verifican cual mes es menor o mayor que cual
		else if( fecha1.mes < mes)
		    {
			System.out.println(toString() + " es despúes de "+fecha1.toString());
		    }else  System.out.println(toString() + " es antes de "+fecha1.toString());
            }
	//Estos condicionales verifican cual año es menor o mayor que cual
	else if ( fecha1.anyo < anyo)
	    {
		System.out.println(toString() + " es despúes de "+fecha1.toString());
            }else  System.out.println(toString() + " es antes de "+fecha1.toString());
    }
}

