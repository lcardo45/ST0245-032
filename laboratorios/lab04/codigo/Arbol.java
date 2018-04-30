class Arbol {
         public Nodo raiz;
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
         public void postOrder(Nodo raiz) {
             if(raiz !=  null) {
                 postOrder(raiz.izq);
                 postOrder(raiz.der);
                 if(raiz.dato != 0)
                 System.out.println(raiz.dato);
                }
            }
     }