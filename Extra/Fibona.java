package Extra;

public class Fibona {
    public static void main(String[] args) {
        int N = 9;
        int ans=luckyOrderID(N);
        System.out.println(ans);
    }
    static int luckyOrderID(int token)
    {
        int answer=0;
        int a = 1, b = 1;
        int counter = 0;
        while (counter < token) {
            int c = b + a;
            System.out.println(a);
            a = b;
            b = c;
            counter+=1;
        }
        answer=b-a;
        return answer;
    }
}
