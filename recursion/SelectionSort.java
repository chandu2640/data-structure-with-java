package recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={8,6,4,3,7,33,11,23,55,12};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int i, int end, int max) {
        if(i==0) return;
        if(end<i){
            if(arr[max]<arr[end]) selectionSort(arr,i,end+1,end);
            else selectionSort(arr,i,end+1,max);
        }
        else{
            swap(arr,i-1,max);
            selectionSort(arr,i-1,0,0);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
