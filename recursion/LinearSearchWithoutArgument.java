package recursion;

import java.util.ArrayList;

public class LinearSearchWithoutArgument {
    public static void main(String[] args) {
        ArrayList<Integer> abc=new ArrayList<>();
        int[] arr={2,6,44,43,1,4,7,9,44,45,44};
        int target=44;
        abc=linSearchAll(arr,target,0);
        System.out.println(linSearchAll(arr,target,0));
    }

    private static ArrayList<Integer> linSearchAll(int[] arr, int target, int i) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(i>arr.length-1) return ans;
        if(arr[i]==target) ans.add(i);
        ArrayList<Integer> ansFromBelowCalls=linSearchAll(arr,target, i+1);
        ans.addAll(ansFromBelowCalls);
        return ans;

    }
}
