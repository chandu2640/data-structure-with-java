package recursion;

public class TaylorSeries {
    public static void main(String[] args) {
        double ans=taylor(4,15);
        System.out.println(ans);
    }

    static double power(double num, double pow){
        if(pow==0) return 1;
        return num*power(num, pow-1);
    }

    private static double taylor(double n, double t) {
        if(t>0){
            return (power(n,t-1)/fact(t-1))+taylor(n,t-1);
        }
        return 0;
    }

    private static double fact(double i) {
        if(i>0) return i*fact(i-1);
        return 1;
    }
}
