public class AmyAl {
 public static int VerticeMasPopularAM(DigraphAM m) {
        int max = 0;
        int maxIndex = -1;
        int actual = 0;
        for (int i = 0; i < m.size; i++) {
            actual = m.getSuccessors(i).size();
            if (actual > max) {
                max = actual;
                maxIndex = i;
            }
            actual = 0;
        }
        return maxIndex;
    }

    //1.2 con AL   
    public static int VerticeMasPopularAL(DigraphAL m, int size) {
        int max = 0;
        int maxIndex = -1;
        int actual = 0;
        for (int i = 0; i < m.size; i++) {
            actual = m.getSuccessors(i).size();
            if (actual > max) {
                max = actual;
                maxIndex = i;
            }
            actual = 0;
        }
        return maxIndex;
    }
}
