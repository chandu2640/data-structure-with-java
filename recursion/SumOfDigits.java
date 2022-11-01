package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=1234;
        int sum=sumOfDigits(n);
        int product=productOfDigits(n);
        System.out.println(sum);
        System.out.println(product);
    }

    private static int productOfDigits(int n) {
        if(n==0) return 1;
        return (n%10)*productOfDigits(n/10);
    }

    private static int sumOfDigits(int n) {
        if(n==0) return 0;
        return sumOfDigits(n/10)+(n%10);
    }
}
