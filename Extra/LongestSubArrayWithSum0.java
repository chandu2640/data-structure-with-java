package Extra;

import java.util.ArrayList;

public class LongestSubArrayWithSum0 {
    public static void main(String[] args) {
        int[] arr= {15,-2,2,-8,1,7,10,23};
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list=subArray(arr);
        int longestLength=sumCount(list);
        System.out.println(longestLength);
    }

    //Finding the sum of all the subarrays and checking wither it is 0
    private static int sumCount(ArrayList<ArrayList<Integer>> list) {
        int longest=0;
        for(ArrayList<Integer> arr: list){
            int sum=0;
            for (int num: arr) {
                sum+=num;
            }
            if(sum==0){
                longest=Math.max(longest,arr.size());
            }
        }
        return longest;
    }

    //Finding all the subArrays
    static ArrayList<ArrayList<Integer>> subArray(int[] arr){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<Integer>());
        for(int num: arr){
            int n=list.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> newList=new ArrayList<>();
                newList.addAll(list.get(i));
                newList.add(num);
                list.add(newList);
            }
        }
        return list;
    }
}
