import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class TRY /*extends JPanel*/
{
    ArrayList<Bee> lista= new ArrayList<Bee>();
    

    /**
     * Constructor for objects of class asd
     */
    public TRY()
    {


    }
    public void beeList(/*String archivo*/)throws FileNotFoundException, IOException{

          String cadena;
          FileReader f = new FileReader("100000Bee.txt");
          BufferedReader b = new BufferedReader(f);
          while((cadena = b.readLine())!=null){
              String[]parts = cadena.split(",");
              Bee bee = new Bee((Double.parseDouble(parts[0])),(Double.parseDouble(parts[1])));
              lista.add(bee);
           }
            b.close();
           // System.out.println(totalBeeCount.get(totalBeeCount.size()-1).x); era una prueba
           // System.out.println(totalBeeCount.get(totalBeeCount.size()-1).y); era una prueba
            
            
    }
    public ArrayList real (){
        try{
            beeList();
        }catch(Exception e){
            System.err.println("el archivo no existe o esta mal construido");
            System.exit(0);
        }
        return lista;
    }
    public void intersecta(ArrayList<Bee> lista)
    {
        int count=0;
        for(int i = 0;i<lista.size();i++){  
            System.out.println(i);
            for(int j = i+1;j<lista.size();j++){
                double distance =Math.sqrt(Math.pow(lista.get(i).x-lista.get(j).x,2)+Math.pow(lista.get(i).y-lista.get(j).y,2));
                if(distance < 0.000005){
                    //System.out.println("Abeja en "+lista.get(i).x +"  "+ lista.get(i).y + " y Abeja en "+ lista.get(j).x +"   "+lista.get(j).y+" estan apunto de colicionar");
                    lista.get(i).setTrue();
                    lista.get(j).setTrue();
                    count ++;
                    System.out.println(count);
                }
                
        
            }
        }
        
        }
     /*       public void paintComponent(Graphics g)
    {
        

        for(int i = 0; i<lista.size();i++){
            double x = (((lista.get(i).x-74.9999)*10000)-5000);
            double y = (((lista.get(i).y-5.9999)*10000)-3000);
            if(lista.get(i).crash){
                g.setColor(Color.red);
                g.fillOval((int)x,(int)y,20,20);
            }else{
                g.setColor(Color.blue);
                g.fillOval((int)x,(int)y,20,20);
           }
        }
    }*/
        public static void main(String[] args){
            TRY try1 = new TRY();
            try1.real();
            try1.intersecta(try1.lista);
            /*JFrame frame = new JFrame("Abejas en peligro");
            frame.add(try1);
            frame.setSize(1000,1000);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.repaint();*/
            
    }
    
}

    

