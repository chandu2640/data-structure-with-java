package recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(4,8));
    }
    static int power(int num, int pow){
        if(pow>0) return num*power(num, pow-1);
        return 1;
    }
}
