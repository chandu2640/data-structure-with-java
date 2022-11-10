package heap;

import java.util.Arrays;

public class CompleteBT {
    static class heap{
        int[] arr=new int[100];
        int size=0;

        heap(){
            arr[0]=-1;
            size=0;
        }

        void insert(int val){
             size+=1;
             int index=size;
             arr[index]=val;

             while (index>1){
                 int parent=index/2;
                 if (arr[parent] < arr[index]){
                     swap(arr,parent,index);
                     index=parent;
                 }
                 else{
                     return;
                 }
             }
        }
        void printHeap(){
            for (int i = 1; i <= size; i++) {
                System.out.print(arr[i]+" ");
            }
//            System.out.println(Arrays.toString(arr));
        }

        private void swap(int[] arr, int parent, int index) {
            int temp=arr[parent];
            arr[parent]=arr[index];
            arr[index]=temp;
        }
    }

    public static void main(String[] args) {
        heap h=new heap();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.insert(45);
        h.insert(47);

        h.printHeap();
    }
}
