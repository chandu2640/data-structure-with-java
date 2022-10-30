package binarySearch;

public class XorProblem {
    public static void main(String[] args) {
        int[] arr={2,2,1,4,5,4,5,9,2,7,2,7,9};
        int ans=0;
        for(int a: arr){
            ans=ans^a;
        }
        System.out.println(ans);
    }
}
