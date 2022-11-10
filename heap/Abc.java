package heap;

import java.util.Arrays;

public class Abc {
    public static void main(String[] args) {
        int[] arr={-1,20,10,30,5,50,40};

        System.out.println(Arrays.toString(arr));
        heapify(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapify(int[] arr) {
        int n=arr.length-1;
        int index=n/2;
        int parent=index;

        while(parent>0){
            int leftIndex=parent*2;
            int rightIndex=parent*2+1;

            if(leftIndex<=n && arr[leftIndex]>arr[parent]){
                swap(arr,parent,leftIndex);
            }
            else if(rightIndex<=n && arr[rightIndex]>arr[parent]){
                swap(arr,parent,rightIndex);
            }
            else return;
            parent-=1;
        }
    }
    private static void swap(int[] arr, int parent, int index) {
        int temp=arr[parent];
        arr[parent]=arr[index];
        arr[index]=temp;
    }
}
