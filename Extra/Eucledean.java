package Extra;

public class Eucledean {
    public static void main(String[] args) {
        int a=120, b=150;
        System.out.println(hcf(a,b));
        System.out.println(lcm(a,b));
    }

    private static int lcm(int a, int b) {
        int c=hcf(a,b);
        return (a*b)/c;
    }

    private static int hcf(int a, int b) {
        if(b>a){
            int temp=a;
            a=b;
            b=temp;
        }
        if(b==0) return a;
        return hcf(b, a%b);
    }
}
