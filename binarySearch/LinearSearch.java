package binarySearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 7, 9, 11, 12, 16, 17, 18, 20, 21, 22, 23, 27, 29, 30, 32, 34, 42, 44, 47, 51, 52, 53, 61, 63, 65, 66, 68, 69, 70, 71, 72, 73, 74, 75, 77, 78, 79, 80, 82, 84, 85, 87, 89, 90, 91, 93, 100};

        linearSearch(arr,51);
        binarySearch(arr,51);
    }

    private static void binarySearch(int[] arr, int item) {
        int low=0;
        int high=arr.length;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==item) {
                System.out.println("The item is present at "+String.valueOf(mid+1)+"th Position");
                break;
            }
            else if(item>arr[mid]) low=mid+1;
            else high=mid-1;
        }
    }

    private static void linearSearch(int[] arr, int item) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println("The item is present at "+String.valueOf(i+1)+"th Position");
                break;
            }
        }

    }


}
