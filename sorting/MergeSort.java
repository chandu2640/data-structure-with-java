package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={4,1, 3, 9, 7};
        System.out.println(Arrays.toString(arr));
        mergeSortInPlace(arr,0,arr.length-1);
//        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int start, int end) {
//        end+=1;
        if(end-start==0) return;
        int mid=start+(end-start)/2;

        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid+1,end);

        mergeInPlace(arr,start,mid+1,end+1);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l]=mix[l];
        }
    }


    public static int[] mergeSort(int[] arr) {
        if(arr.length==1) return arr;

        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeArrays(left,right);

    }
    private static int[] mergeArrays(int[] left, int[] right) {
        int[] arr=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
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
            while(i<left.length){
                arr[k]=left[i];
                i++;
                k++;
            }
            while(j<right.length){
                arr[k]=right[j];
                j++;
                k++;
            }
            return arr;
    }
}
