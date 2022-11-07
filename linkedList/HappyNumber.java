package linkedList;

public class HappyNumber {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        do{
            a++;
            System.out.println(a);
        }while(a<n);
    }

    public static int power(int n){
        int sum=0;
        while(n>0){
            sum+=(int)Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }


    private static boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=power(slow);
            fast=power(power(fast));
        }while(fast != slow);

        if(slow==1) return true;
        return false;
    }
}
