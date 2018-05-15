import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import java.io.*;
/*
 *              N
 *          W       E
 *              S
 */

class Node {
    float x, y;
    boolean value;

    Node(float x, float y, boolean value) {
        this.x = x;
        this.y = y;
        this.value = value; /* some data*/ 
    }
}

/* Using two points of Rectangular (Top,Left) & (Bottom , Right)*/
class Boundry {
    public float getxMin() {
        return xMin;
    }

    public float getyMin() {
        return yMin;
    }

    public float getxMax() {
        return xMax;
    }

    public float getyMax() {
        return yMax;
    }

    public Boundry(float xMin, float yMin, float xMax, float yMax) {
        super();
        /*
         *  Storing two diagonal points 
         */
        this.xMin = xMin;
        this.yMin = yMin;
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public boolean inRange(double x, double y) {
        return (x >= this.getxMin() && x <= this.getxMax()
                && y >= this.getyMin() && y <= this.getyMax());
    }

    float xMin, yMin, xMax, yMax;

}

public class QuadTree {
    final int MAX_CAPACITY =4;
    int level = 0;
    List<Node> nodes;
    QuadTree northWest = null;
    QuadTree northEast = null;
    QuadTree southWest = null;
    QuadTree southEast = null;
    Boundry boundry;
    int count;

    QuadTree(int level, Boundry boundry) {
        this.level = level;
        nodes = new ArrayList<Node>();
        this.boundry = boundry;
    }

    /* Traveling the Graph using Depth First Search*/
    static void namer(QuadTree tree) {
        if (tree == null)
            return;

        //System.out.printf("\nLevel = %d [X1=%f Y1=%f] \t[X2=%f Y2=%f] ",
                //tree.level, tree.boundry.getxMin(), tree.boundry.getyMin(),
                //tree.boundry.getxMax(), tree.boundry.getyMax());

        for (Node node : tree.nodes) {
            //System.out.printf(" \n\t  x=%f y=%f", node.x, node.y);
        }
        if (tree.nodes.size() == 0) {
            //System.out.printf(" \n\t  Leaf Node.");
        }
        if(tree.nodes.size()>=2){
            for(int i = 0;i<tree.nodes.size();i++){  
                //System.out.println(i);
                for(int j = i+1;j<tree.nodes.size();j++){
                    double distance =Math.sqrt(Math.pow(tree.nodes.get(i).x-tree.nodes.get(j).x,2)+Math.pow(tree.nodes.get(i).y-tree.nodes.get(j).y,2));
                    if(distance < 100){
                        //System.out.println("Abeja en "+lista.get(i).x +"  "+ lista.get(i).y + " y Abeja en "+ lista.get(j).x +"   "+lista.get(j).y+" estan apunto de colicionar");
                        //tree.nodes.get(i).setTrue();
                        //tree.nodes.get(j).setTrue();
                        
                        System.out.println("Abeja en "+((((tree.nodes.get(i).x+5000)/10000)+75)*(-1)) +"  "+ (((tree.nodes.get(i).y+3000)/10000)+6) + " y Abeja en "+ ((((tree.nodes.get(j).x+5000)/10000)+75)*(-1)) +"   "+(((+tree.nodes.get(j).y+3000)/10000)+6) +" estan apunto de colicionar");
                    }
                
        
                }
            }
        }
        
        namer(tree.northWest);
        namer(tree.northEast);
        namer(tree.southWest);
        namer(tree.southEast);

    }

    void split() {
        float xOffset = this.boundry.getxMin()
                + (this.boundry.getxMax() - this.boundry.getxMin()) / 2;
        float yOffset = this.boundry.getyMin()
                + (this.boundry.getyMax() - this.boundry.getyMin()) / 2;

        northWest = new QuadTree(this.level + 1, new Boundry(
                this.boundry.getxMin(), this.boundry.getyMin(), xOffset,
                yOffset));
        northEast = new QuadTree(this.level + 1, new Boundry(xOffset,
                this.boundry.getyMin(), xOffset, yOffset));
        southWest = new QuadTree(this.level + 1, new Boundry(
                this.boundry.getxMin(), xOffset, xOffset,
                this.boundry.getyMax()));
        southEast = new QuadTree(this.level + 1, new Boundry(xOffset, yOffset,
                this.boundry.getxMax(), this.boundry.getyMax()));

    }
    
    void insert(float x, float y, boolean value) {
        
        if (!this.boundry.inRange(x, y)) {
            return;
        }

        Node node = new Node(x, y, value);
        if (nodes.size() < MAX_CAPACITY) {
            nodes.add(node);
            //count++;
            return;
        }
        // Exceeded the capacity so split it in FOUR
        if (northWest == null) {
            split();
        }

        // Check coordinates belongs to which partition 
        if (this.northWest.boundry.inRange(x, y)){
            this.northWest.insert(x, y, value);
            //count++;
        }else if (this.northEast.boundry.inRange(x, y)){
            this.northEast.insert(x, y, value);
            //count++;
        }else if(this.southWest.boundry.inRange(x, y)){
            this.southWest.insert(x, y, value);
            //count++;
        }else if (this.southEast.boundry.inRange(x, y)){
            this.southEast.insert(x, y, value);
            //count++;
            //else
           //System.out.printf("ERROR : Unhandled partition %f %f ", x, y);
        }
    }
    
           
    
    public void beeList()throws FileNotFoundException, IOException{
          String cadena;
          FileReader f = new FileReader("100000Bee.txt");
          BufferedReader b = new BufferedReader(f);
          while((cadena = b.readLine())!=null){
              String[]parts = cadena.split(",");
              Node node = new Node((float)(((-1)*(Double.parseDouble(parts[0]))-75)*10000)-5000f,(float)((Double.parseDouble(parts[1])-6)*10000)-3000f,false);
              float y =  (float)((Double.parseDouble(parts[1])-6)*10000)-3000f;
              insert(node.x,node.y,false);
              
              //System.out.println(node.x+"  "+node.y);
           }
            b.close();
           // System.out.println(totalBeeCount.get(totalBeeCount.size()-1).x); era una prueba
           // System.out.println(totalBeeCount.get(totalBeeCount.size()-1).y); era una prueba
            
            
    }
    public void real (){
        try{
            beeList();
        }catch(Exception e){
            System.err.println("el archivo no existe");
            System.exit(0);
        }
        return;
    }
    
    public static void main(String args[]) {
        QuadTree anySpace = new QuadTree(1, new Boundry(0, 0, 1000, 1000));
        /*anySpace.insert(100, 100, false);
        anySpace.insert(500, 500, false);
        anySpace.insert(600, 600, false);
        anySpace.insert(700, 600, false);
        anySpace.insert(800, 600, false);
        anySpace.insert(900, 600, false);
        anySpace.insert(510, 610, false);
        anySpace.insert(520, 620, false);
        anySpace.insert(530, 630, false);
        anySpace.insert(540, 640, false);
        anySpace.insert(550, 650, false);
        anySpace.insert(555, 655, false);
        anySpace.insert(560, 660, false);*/
        //Traveling the graph
        anySpace.real();
       // System.out.println(anySpace.count);
        QuadTree.namer(anySpace);
    }
    
}
