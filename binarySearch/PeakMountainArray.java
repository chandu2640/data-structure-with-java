package binarySearch;

public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 8,2,0};

        int ans=maxElement(arr);
        System.out.println(ans);
    }

    static int maxElement(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) end=mid;
            else start=mid+1;
            if(start==end) break;

        }
        return arr[end];
    }


}
