package Extra;

import java.math.BigInteger;

public class TwoStringSum {
    public static void main(String[] args) {
        int[] nums={5,8,9,1,3};
        int target=9;

        int pivot=pivotElement(nums);
        int ans=binSearch(nums, target,0, pivot);
        if(ans==-1) {
            ans=binSearch(nums, target, pivot+1, nums.length-1);
        }
        System.out.println(ans);
    }

    private static int pivotElement(int[] nums) {
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]) return mid;
            if(mid>start && nums[mid]<nums[mid-1]) return mid-1;
            if(nums[mid]<=nums[start]) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    static int binSearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]) end=mid-1;
            else if(target>nums[mid]) start=mid+1;
            else return mid;
        }
        return -1;
    }
}
