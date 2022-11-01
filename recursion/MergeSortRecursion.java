package recursion;

import java.util.Arrays;


public class MergeSortRecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,1,0,3};
        System.out.println(Arrays.toString(arr));
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArrays(left,right);
    }

    private static int[] mergeArrays(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }
}
