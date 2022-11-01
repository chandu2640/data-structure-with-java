package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,9,14,15,17,19,22,25,28,29};
        int target=19;
        int ans=binSearch(arr,0,arr.length-1,target);
        System.out.println(ans);
    }

    private static int binSearch(int[] arr, int start, int end, int target) {
        if(start > end) return -1;

        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;

        if(target < arr[mid]) return binSearch(arr,start, mid-1,target);
        else return binSearch(arr,mid+1, end, target);
    }
}
