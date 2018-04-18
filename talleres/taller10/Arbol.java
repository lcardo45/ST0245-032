class Arbol {
         private Nodo raiz;
       private void imprimir(Nodo nodo){
        if (nodo != null){
           imprimir(nodo.izq);
           System.out.println(nodo.dato);
           imprimir(nodo.der);
        }
     }
     public void imprimir(){
       imprimir(raiz);
      }
         private void insertar(Nodo nodo, int n){            
             if (nodo.dato == n)
                return ;
             if (n > nodo.dato)
                 if (nodo.der == null)
                    nodo.der = new Nodo(n);
                 else
                    insertar(nodo.der, n);
             else
                 if (nodo.izq == null)
                    nodo.izq = new Nodo(n);
                 else
                    insertar(nodo.izq, n);   
         }
         public void insertar(int n){
               if (raiz == null)
                 raiz = new Nodo(n);
               else
                 insertar(raiz, n);
         }
         private boolean buscar(Nodo nodo, int n){
             if (nodo == null)
                return false;
             if (nodo.dato == n)
                return true;
             if (n > nodo.dato)
                return buscar(nodo.der, n);
             return buscar(nodo.izq, n);             
         }
         public boolean buscar(int n){
            return buscar(raiz,n);
         }
          public boolean removeNodo( Nodo nodo ) {
             //codigo obtenido de https://serprogramador.es/programar-arboles-binarios-parte-2-eliminar-nodos/
        /* Creamos variables para saber si tiene hijos izquierdo y derecho */
        
        boolean tieneNodoDerecha = nodo.der != null ? true : false;
        boolean tieneNodoIzquierda = nodo.izq != null ? true : false;
 
        /* Verificamos los 3 casos diferentes y llamamos a la función correspondiente */
 
        /* Caso 1: No tiene hijos */
        if (!tieneNodoDerecha && !tieneNodoIzquierda) {
            return removeNodoCaso1( nodo );
        }
 
        /* Caso 2: Tiene un hijo y el otro no */
        if ( tieneNodoDerecha && !tieneNodoIzquierda ) {
            return removeNodoCaso2( nodo );
        }
 
        /* Caso 2: Tiene un hijo y el otro no */
        if ( !tieneNodoDerecha && tieneNodoIzquierda ) {
            return removeNodoCaso2( nodo );
        }
 
        /* Caso 3: Tiene ambos hijos */
        if ( tieneNodoDerecha && tieneNodoIzquierda ) {
            return removeNodoCaso3( nodo );
        }
 
        return false;
    }
 
    private boolean removeNodoCaso1( Nodo nodo ) {
        /* lo único que hay que hacer es borrar el nodo y establecer el apuntador de su padre a nulo */
 
        /*
         * Guardemos los hijos del padre temporalmente para saber cuál de sus hijos hay que 
         * eliminar
         */
        Nodo hijoIzquierdo = nodo.getPadre().getHojaIzquierda();
        Nodo hijoDerecho = nodo.getPadre().getHojaDerecha();
 
        if ( hijoIzquierdo == nodo ) {
            nodo.getPadre().setHojaIzquierda( null );
            return true;
        }
 
        if ( hijoDerecho == nodo) {
            nodo.getPadre().setHojaDerecha( null );
            return true;
        }
 
        return false;
    }
 
    private boolean removeNodoCaso2( Nodo nodo ) {
        /* Borrar el Nodo y el subárbol que tenía pasa a ocupar su lugar */
 
        /*
         * Guardemos los hijos del padre temporalmente para saber cuál de sus hijos hay que 
         * eliminar
         */
        Nodo hijoIzquierdo = nodo.getPadre().getHojaIzquierda();
        Nodo hijoDerecho = nodo.getPadre().getHojaDerecha();
 
        /*
         * Buscamos el hijo existente del nodo que queremos eliminar
         */
        Nodo hijoActual = nodo.getHojaIzquierda() != null ? 
                nodo.getHojaIzquierda() : nodo.getHojaDerecha();
 
        if ( hijoIzquierdo == nodo ) {
            nodo.getPadre().setHojaIzquierda( hijoActual );
 
            /* Eliminando todas las referencias hacia el nodo */
            hijoActual.setPadre(nodo.getPadre());
            nodo.setHojaDerecha(null);
            nodo.setHojaIzquierda(null);
 
            return true;
        }
 
        if ( hijoDerecho == nodo) {
            nodo.getPadre().setHojaDerecha( hijoActual );
 
            /* Eliminando todas las referencias hacia el nodo */
            hijoActual.setPadre(nodo.getPadre());
            nodo.setHojaDerecha(null);
            nodo.setHojaIzquierda(null);
 
            return true;
        } 
 
        return false;
    }
 
    private boolean removeNodoCaso3( Nodo nodo ) {
        /* Tomar el hijo derecho del Nodo que queremos eliminar */
        Nodo nodoMasALaIzquierda = recorrerIzquierda( nodo.getHojaDerecha() );
        if ( nodoMasALaIzquierda != null ) {
            /*
             * Reemplazamos el valor del nodo que queremos eliminar por el nodo que encontramos 
             */
            nodo.setValor( nodoMasALaIzquierda.getValor() );
            /* 
             * Eliminar este nodo de las formas que conocemos ( caso 1, caso 2 ) 
             */
            removeNodo( nodoMasALaIzquierda );
            return true;
        }
        return false;
    }
 
    /* Recorrer de forma recursiva hasta encontrar el nodo más a la izquierda */
    private Nodo recorrerIzquierda(Nodo nodo) {
        if (nodo.getHojaIzquierda() != null) {
            return recorrerIzquierda( nodo.getHojaIzquierda() );
        }
        return nodo;
    }
}

