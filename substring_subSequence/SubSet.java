package substring_subSequence;

import java.util.*;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        List<List<Integer>> ans = subSetDup(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> subSetDup(int[] arr) {
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                if(!outer.contains(internal)) outer.add(internal);
            }
        }
        return outer;
    }

    private static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n= outer.size();
            for(int i=0; i<n; i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

}
