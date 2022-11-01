package recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> abc=new ArrayList<>();
        int[] arr={2,6,44,43,1,4,7,9,44,45,44};
        int target=44;
        linSearchAll(arr,target,0);
        System.out.println(linSearchFirst(arr,target,0));
        System.out.println(linSearchLast(arr,target,arr.length-1));
        System.out.println(linSearchAll(arr,target,0,abc));
        System.out.println(list);
    }

    private static int linSearchFirst(int[] arr, int target, int n) {
        if(n>arr.length-1) return -1;
        if(arr[n]==target) return n;
        return linSearchFirst(arr,target,n+1);
    }
    private static int linSearchLast(int[] arr, int target, int n) {
        if(n<0) return -1;
        if(arr[n]==target) return n;
        return linSearchLast(arr,target,n-1);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    private static void linSearchAll(int[] arr, int target, int n) {
        if(n>arr.length-1) return;
        if(arr[n]==target) list.add(n);
        linSearchAll(arr,target,n+1);
    }
    private static ArrayList linSearchAll(int[] arr, int target, int n, ArrayList<Integer> abc) {
        if(n>arr.length-1) return abc;
        if(arr[n]==target) abc.add(n);
        return linSearchAll(arr,target,n+1, abc);
    }
}
