package recursion;

public class TaylorSeries2 {
    public static void main(String[] args) {
        double ans=taylor(4,15);
        System.out.println(ans);
    }
    public static double s;

    private static double taylor(double n, double t) {
        if(t==0){
            return s;

        }
        s=1+n*s/t;
        return taylor(n,t-1);
    }
}
