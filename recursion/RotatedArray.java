package recursion;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr={15,18,20,1,2,4,5,6,8,12};
        int target=20;
        int ans=binSearch(arr,target);
        System.out.println(ans);
    }

    private static int binSearch(int[] arr, int target) {
        int peak=peakElement(arr, 0, arr.length-1);
        int ans=biSear(arr,0,peak,target);
        if(ans==-1) ans=biSear(arr,peak+1, arr.length-1, target);
        return ans;
    }

    private static int biSear(int[] arr, int start, int end, int target) {
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if(arr[mid] == target) return mid;
        if(target<arr[mid]) return biSear(arr,start,mid-1,target);
        else return biSear(arr,mid+1,end,target);
    }

    private static int peakElement(int[] arr, int start, int end) {
        int mid=start+(end-start)/2;
        if(start>end) return arr.length-1;
        if(mid<end && arr[mid]>arr[mid+1]) return mid;
        if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
        if(arr[mid]<=arr[start]) return peakElement(arr,start,mid-1);
        else return peakElement(arr,mid+1,end);
    }
}
