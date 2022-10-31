package sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr={2,1,4,5,3};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctPosition = arr[i] - 1;
            if(arr[correctPosition] != arr[i]){
                swap(arr,correctPosition,i);
            }
            else{
                i++;
            }
        }
    }
    private static void swap(int[] arr, int max, int i) {
        int temp=arr[max];
        arr[max]=arr[i];
        arr[i]=temp;
    }
}
