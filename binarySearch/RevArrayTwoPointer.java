package binarySearch;

import java.util.Arrays;

public class RevArrayTwoPointer {
    public static void main(String[] args) {
        int[] arr={1,5,8,9,6,44,23,65,11};

        System.out.println(Arrays.toString(arr));
        reverese(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    static void delete(int[] arr, int index){

    }
    static void reverese(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
