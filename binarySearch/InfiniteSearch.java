package binarySearch;

public class InfiniteSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170,175,180,190,195,210};
        int target=4;

        int ans=infiniteSearchAns(arr, target);
        System.out.println(ans);
    }

    private static int infiniteSearchAns(int[] arr, int target) {
        int start=0;
        int end=1;
        int newStart=0;
        while(target>arr[end]){
            newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
//        System.out.println(newStart);
//        System.out.println(end);
        int ans=infiniteSearch(arr,target,start,end);
        return ans;
//        return -1;
    }

    private static int infiniteSearch(int[] arr, int target, int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target) end=mid-1;
            else if(arr[mid]<target) start=mid+1;
            else return mid;
        }
        return -1;
    }
}
