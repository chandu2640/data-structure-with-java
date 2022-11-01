package recursion;

public class FIbo {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {

            System.out.println(luckyOrderID(i));

        }
    }

    static int luckyOrderID(int token){
        if(token<2) return token;
        else return luckyOrderID(token-1)+luckyOrderID(token-2);
    }
}
