package sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={0,54,34,23};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index=maxIndex(arr,0,arr.length-i);
            swap(arr,index,arr.length-i-1);
        }
    }

    private static int maxIndex(int[] arr, int i, int i1) {
        int max=arr[0];
        int index=0;
        for (int j = 1; j < i1; j++) {
            if(arr[j]>max) {
                max=arr[j];
                index=j;
            }
        }
        return index;
    }

    private static void swap(int[] arr, int max, int i) {
        int temp=arr[max];
        arr[max]=arr[i];
        arr[i]=temp;
    }
}
