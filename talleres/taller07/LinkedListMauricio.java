import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListMauricio {
    private Node first;
    private int size;
    private int maximo = 0;
    public LinkedListMauricio()
    {
        size = 0;
        first = null; 
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
     private Node getNode(int index) throws IndexOutOfBoundsException {
         if (index >= 0 && index < size) {
             Node temp = first;
             for (int i = 0; i < index; i++) {
                 temp = temp.next;
                }
                return temp;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size()
    {
        return this.size;
    }

    // Inserta un dato en la posición index
    public void insert(int data, int index)
    {
        if (index >= 0 && index < size+1) {
            size++;
            Node temp = new Node(data);
            if(index==0){
                temp.next = first;
                first = temp;
            }else{
                Node anterior = getNode(index-1);
                temp.next = anterior.next;
                anterior.next = temp;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    // Borra el dato en la posición index
    public void remove(int index)
    {
        if (index >= 0 && index < size) {
            size--;
           
            if(index==0){
                first = first.next;
            }else if(indes == size){
                getNode(index) = null;
            }else{
                Node anterior = getNode(index-1);
                Node posterior = getNode(index+1);
                anterior.next = posterior;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    // Verifica si está un dato en la lista
    public boolean contains(int data)
    {
        int index = 0;
        boolean resultado = false;
        while(index<size){
            int temp = get(index);
            if(temp == data){
                resultado = true;
                break;
            }
            index++;
        }
        return resultado;
    }
    public int max(int n){
        if (n >= 0 && n < size) {
            if(n==0){
                if(maximo<get(0)){
                    return get(0);
                }else{
                    return maximo;
                }
            }else{
                if(maximo<get(n)){
                    maximo = get(n);
                    max(n-1);
                }else{
                    max(n-1);
                }
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
        return maximo;
    }
}