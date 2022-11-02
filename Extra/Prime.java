package Extra;

public class Prime {
    public static void main(String[] args) {
        int n=13;
        for(int i=2; i<=n; i++){
            if(prime(i)) System.out.println(i);
        }

    }

    private static boolean prime(int n) {
        for(int i=2; i<n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
