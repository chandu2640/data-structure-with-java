package recursion;

public class NoOfZeros {
    public static void main(String[] args) {
        int num=40303;
        int count=0;
        int abc=zeros(num, count);
        System.out.println(abc);
    }

    private static int zeros(int num, int count) {
        if(num==0){
            return count;
        }
        if(num%10==0) return zeros(num/10,count+1);
        else return zeros(num/10,count);
    }

    static int ans=0;

//    private static int zeros(int num) {
//        if(num>0){
//            if(num%10==0) ans++;
//            zeros(num/10);
//        }
//        return ans;
//    }
}
