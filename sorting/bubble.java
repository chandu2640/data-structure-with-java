package sorting;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr={5,-3,-65,0,54};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n; i++){
            int swapCount=0;
            for(int j=1; j<n-i; j++){
                if(arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                    swapCount++;
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(swapCount);
            if(swapCount==0) break;
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
