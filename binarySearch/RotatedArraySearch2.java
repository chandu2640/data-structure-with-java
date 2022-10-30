package binarySearch;


public class RotatedArraySearch2 {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        int pivot=pivotElement(nums);
        System.out.println(pivot);
        boolean ans=binSearch(nums, target, 0, pivot);
        if(ans==false) ans=binSearch(nums, target, pivot+1, nums.length-1);
        System.out.println(ans);

    }
    static int pivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid-1;

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) return start;
                start++;
                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) return end - 1;
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    static boolean binSearch(int[] nums, int target, int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]) end=mid-1;
            else if(target>nums[mid]) start=mid+1;
            else return true;
        }
        return false;
    }
}
