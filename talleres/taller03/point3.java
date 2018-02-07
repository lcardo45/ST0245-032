public class point3 {   
    private static void cambiar(String base, String s) {
        if(s.length() == 0){
            System.out.println(base);
        } else {
            for (int i = 0; i < s.length(); i++){
                cambiar(base + s.charAt(i), s.substring(0,i) + s.substring(i+1, s.length()));
            }
        }
    }
    public static void cambio(String s) {
        cambiar("", s);
    }
}   