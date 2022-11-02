package slidingWindow;

import java.util.ArrayList;

public class FixedSize {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=4;
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(sum);
        for (int i = k; i < arr.length; i++) {
            sum-=arr[i-k];
            sum+=arr[i];
            ans.add(sum);
        }
        System.out.println(ans);
    }
}
