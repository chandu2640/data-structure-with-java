package heap;

import java.util.PriorityQueue;

public class HeapPreactice {
    static class heap{
        int[] arr=new int[100];
        int size;

        heap(){
            arr[0]=-1;
            size=0;
        }


        void insert(int val){
            size+=1;
            int index=size;

            arr[index]=val;
            while(index>1){
                int parent=index/2;
                if(arr[parent]<arr[index]){
                    swap(arr,parent,index);
                    index=parent;
                }
                else return;
            }
        }
        private void swap(int[] arr, int parent, int index) {
            int temp=arr[parent];
            arr[parent]=arr[index];
            arr[index]=temp;
        }
        void print(){
            for (int i = 1; i <= size; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        void deleteFromHeap(){
            if(size==0){
                System.out.println("Nothing to delete");
                return;
            }
            arr[1]=arr[size];
            size--;

            int i=1;
            while (i<size){
                int leftIndex=i*2;
                int rightIndex=i*2+1;

                if(leftIndex<size && arr[i]<arr[leftIndex]){
                    swap(arr,i,leftIndex);
                    i=leftIndex;
                }
                else if (rightIndex<size && arr[i]>arr[rightIndex]) {
                    swap(arr,i,rightIndex);
                    i=rightIndex;
                }
                else return;
            }
//            heapify(arr,size,size/2);
        }
        void heapify(int arr[], int n, int i)
        {
            int largest = i; // Initialize largest as root
            int l = 2 * i ; // left = 2*i + 1
            int r = 2 * i +1; // right = 2*i + 2

            // If left child is larger than root
            if (l < n && arr[l] > arr[largest])
                largest = l;

            // If right child is larger than largest so far
            if (r < n && arr[r] > arr[largest])
                largest = r;

            // If largest is not root
            if (largest != i) {
                swap(arr,i,largest);

                // Recursively heapify the affected sub-tree
                heapify(arr, n, largest);
            }
        }
        void heapSort()
        {
            for (int i = size / 2 ; i > 0; i--)
                heapify(arr, size, i);


            // One by one extract an element from heap
            for (int i = size; i > 0; i--) {
                // Move current root to end
                swap(arr,1,i);

                // call max heapify on the reduced heap
                heapify(arr, i, 1);
            }
        }
    }




    public static void main(String[] args) {
        PriorityQueue<Integer> que=new PriorityQueue<>();
        heap h=new heap();
        h.insert(52);
        h.insert(55);
        h.insert(57);
        h.insert(51);
        h.insert(53);
        h.insert(96);
        h.insert(54);
        h.insert(85);
        h.print();
        System.out.println();
        h.deleteFromHeap();
        h.print();
        System.out.println();
        h.heapSort();
        h.print();

    }
}
