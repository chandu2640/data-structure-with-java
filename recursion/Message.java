package recursion;

public class Message {
    public static void main(String[] args) {
//        fun(5);
        int s=sum(5);
        System.out.println(s);
    }



    private static int sum(int i) {
        if(i>0){

            return i+sum(i-1);
        }
        return 0;
    }

    private static int sum(int start, int end) {
        if(start<end){
            return start+sum(start+1,end);
        }
        return 0;
    }

    private static void fun(int n) {
        if(n>0){
            fun(n-1);
            System.out.println(n);
            System.out.println("Fun "+n+" done");
        }

    }
}
