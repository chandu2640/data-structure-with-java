package recursion;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr={8,6,4,3,7,33,11,23,55,12};
        int ans=maxElement(arr,0, 0);
        System.out.println(ans);
    }

    private static int maxElement(int[] arr,int start, int max) {
        if(start>arr.length-1) return max;
        if(max<arr[start]) max=arr[start];
        return maxElement(arr,start+1, max);

    }
}
