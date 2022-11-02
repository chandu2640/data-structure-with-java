package Extra;

import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
        int n=7507;
        boolean[] prime=new boolean[n+1];
        for(int i=2; i<=n; i++){
            if (prime[i]==false){
                for(int j=i+i; j<=n; j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if (prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}
