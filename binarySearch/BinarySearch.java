package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr={9,8,7,6,5,4,3,2,1};
        int ans=binSearch(arr,8);
        System.out.println(ans);
    }


    static int binSearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid+1;
            else if(arr[0]<arr[arr.length-1]){
                if(target>mid) start=mid+1;
                else end=mid-1;
            }
            else if(arr[0]>arr[arr.length-1]){
                if(target>mid) end=mid-1;
                else start=mid+1;
            }
        }
        return -1;
    }
}
