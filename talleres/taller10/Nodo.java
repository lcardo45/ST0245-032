class Nodo {
  public Nodo(int n) { dato = n;}
  public int dato;
  public Nodo izq;
  public Nodo der; private int valor;
 
    private Nodo padre;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;
 
 
    /* Setters y Getters */
    public void setValor(int valor) {
        this.valor = valor;
    }
 
    public int getValor() {
        return valor;
    }
 
    public Nodo getPadre() {
        return padre;
    }
 
    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
 
    public Nodo getHojaIzquierda() {
        return hojaIzquierda;
    }
 
    public void setHojaIzquierda(Nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }
 
    public Nodo getHojaDerecha() {
        return hojaDerecha;
    }
 
    public void setHojaDerecha(Nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
 
}