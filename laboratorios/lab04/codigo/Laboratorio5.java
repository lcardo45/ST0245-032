public class Laboratorio5 {

   
   public static void dibujarArbolAux(Node nodo)
   {
      if (nodo != null)
         //"x_\n__" -> "xo\n__";
         for(Node n: new Node[] {nodo.left, nodo.right} ){
            if (n != null)
               System.out.println("\"" + nodo.data + "\" -> \"" + n.data + "\";");
            dibujarArbolAux(n);
        }
   }

    
    public static void main(String[] args) {
    
        //El Arbol familiar de Federico Banoy Restrepo
        BinaryTree BanoyRestrepo = new BinaryTree();
        Node f = new Node("Federico");
        Node cl = new Node("Claudia Marcela");
        Node m = new Node("Mauricio");
        Node l = new Node("Leyda");
        Node a = new Node("Agustin");
        Node lu = new Node("Lucila");
        Node r = new Node("Ruben");
        Node lui = new Node("Luisa");
        Node ma = new Node("Marcos");
        Node b = new Node("Blanca");
        Node n = new Node("Nepomuceno");
        Node e = new Node("Elisa");
        Node d = new Node("Diogenes");
        Node be= new Node("Beatriz");
        Node ne= new Node("Nepomuceno");
        BanoyRestrepo.root = f;
        f.left = cl;
        f.right = m;
        cl.left = l;
        cl.right = a;
        l.left = lu;
        l.right = r;
        a.left = lui;
        a.right = ma;
        m.left = b;
        m.right = n;
        b.left = e;
        b.right = d;
        n.left = be;
        n.right = ne;
        BanoyRestrepo.buscar("Nepomuceno");
        System.out.println(BanoyRestrepo.gul);
        // ...
        
        //Imprime el árbol familiar
        BanoyRestrepo.recursivePrint();


    }
}
