public class Hanoi {
    private static void torresDeHannoiAux(int n, char origen, char intermedio, char destino) {
        if(n == 1){
            System.out.println(" mover disco " + n + " a torre " + destino+ "\n");
        } else {
            torresDeHannoiAux(n-1, origen, destino, intermedio);
            System.out.println(" mover disco " + n + " a torre " + destino+ "\n");
            torresDeHannoiAux(n-1, intermedio, origen, destino);
        }
    }   
    public static void torresDeHannoi(int n) {
        torresDeHannoiAux(n, 'A', 'B', 'C');
    }
}
 