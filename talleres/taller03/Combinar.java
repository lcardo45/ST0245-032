public class Combinar {
    private static void c(String base, String s, int n) {
        if (n == 0){
            for(int i = 0; i < s.length(); i++){
                c("", s.substring(i), 1);
            }
        } else if (s.length() == 0){
            System.out.println(base);
        }
        else
        {
            for (int i = 1; i <= s.length(); i++){
                c(base + s.charAt(0), s.substring(i), i);
            }
        }
    }
    public static void conb(String s) {
        c("", s, 0);
    }
}

