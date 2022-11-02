package Extra;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr={20,1,2,4,5,6,8,12};
        int target=12;
        int ans=binSearch(arr,target);
        System.out.println(ans);
    }

    private static int binSearch(int[] arr, int target) {
        int peak=peakElement(arr);
        int ans=bSear(arr, 0,peak, target);
        if(ans==-1) ans=bSear(arr, peak+1, arr.length-1, target);
        return ans;
    }

    private static int bSear(int[] arr, int start, int end, int target) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(target<arr[mid]) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }


    private static int peakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]) return mid;
            if(mid>start && nums[mid]<nums[mid-1]) return mid-1;
            if(nums[mid] <= nums[start]) end=mid-1;
            else start=mid+1;
        }
        return nums.length-1;
    }
}
