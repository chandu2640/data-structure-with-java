package recursion;

import java.util.Arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,18};
        System.out.println(sorted(arr,0));
        System.out.println(sorted(arr));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,1,arr.length)));
    }

    private static boolean sorted(int[] arr) {
        if(arr.length==1) return true;
        return arr[0]<arr[1] && sorted(Arrays.copyOfRange(arr,1,arr.length));
    }
    private static boolean sorted(int[] arr, int n) {
        if(n==arr.length-1) return true;
        return arr[n]<arr[n+1] && sorted(arr,n+1);
    }
}
