public class BinaryTree {
    public Node root;
    public boolean gul = false;
    public BinaryTree(){
        root = null;
    }
    private int max2(int i, int j)
    {
        if (i > j)
            return i;
        return j;
    }
    
    private int maxheightAUX(Node node)
    {
        if (node == null)
                return 0;
        else 
                return max2(maxheightAUX(node.left), maxheightAUX(node.right))+1;
    }
    
    public int maxheight()
    {
       return maxheightAUX(root);
    }

    private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }
        
        
    }
    private boolean buscar(Node node, String n){
            if (node != null){
                if(node.data == n){
                     gul = true;
                }
                buscar(node.left, n);
                buscar(node.right, n);
            }
              return gul;
            
    }
    public boolean buscar(String n){
            return buscar(root,n);
    }    
        private void abuelaMaterna(Node node)
    {
        int comprobar = 0;
        if (node != null && comprobar<2 )
        {
           abuelaMaterna(node.left);
           comprobar++;
        }else if(node != null && comprobar == 2){
            System.out.println(node.data + " es el nombre de su abuela materna");
        }else{
            System.out.println("no se encontro la abuela");
        }
        
        
    }
        public void postOrder(Node root) {
        if(root !=  null) {
                 postOrder(root.left);
                 postOrder(root.right);
                 System.out.println(root.data);
        }
    }
    public void recursivePrint()
    {
        recursivePrintAUX(root);
    }
        

    
 
}