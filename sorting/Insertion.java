package sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr={0,54,34,23};
        System.out.println(Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    private static void swap(int[] arr, int max, int i) {
        int temp=arr[max];
        arr[max]=arr[i];
        arr[i]=temp;
    }
}
