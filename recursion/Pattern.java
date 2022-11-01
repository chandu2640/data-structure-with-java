package recursion;

public class Pattern {
    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            for (int j = i; j < 4; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        patternUsingRecursion(4,0);
    }

    private static void patternUsingRecursion(int r, int c) {
        if(r==0) return;
        if(c<r) {
            patternUsingRecursion(r,c+1);
            System.out.print("*");
        }
        else{
            patternUsingRecursion(r-1,0);
            System.out.println();
        }
    }
}
