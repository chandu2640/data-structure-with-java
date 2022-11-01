package recursion;

public class Pallindrome {
    public static void main(String[] args) {
        int n=1221;

        int ans=reverseNumber(n);
        if(n==ans) System.out.println("Pallindrome");
        else System.out.println("Not Pallindrome");
//        System.out.println(ans);
    }

    private static int reverseNumber(int n) {
        if(n==0) return 0;
        int digit=(int)Math.pow(10,(int)Math.log10(n));
        return ((n%10)*digit)+reverseNumber(n/10);
    }
}
