package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={8,6,4,3,7,33,11,23,55,12};
        System.out.println(Arrays.toString(arr));
//        normalBubbleSort(arr);
        recurssionBubbleSort(arr,0, 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    private static void recurssionBubbleSort(int[] arr, int i, int j, int count) {
        if(i>=arr.length ) return;
        if(j<arr.length-i ) {
            if(arr[j]<arr[j-1]) {
                swap(arr,j, j-1);
                count++;
            }
            recurssionBubbleSort(arr, i,j+1, count);
            if(count ==0) return;
        }
        else{
            recurssionBubbleSort(arr,i+1, 1,0);
        }
    }


    private static void normalBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                    count++;
                }
            }
            if(count==0) break;
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
