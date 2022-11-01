package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("start");
        int ans=fact(3);
        System.out.println(ans);
        System.out.println("Done");
    }

    static int fact(int n) {
        if(n>0){
            return n * fact(n-1);
        }
        return 1;
    }
}
