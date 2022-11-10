package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> que=new PriorityQueue<>();
        ArrayList<Integer> arr=new ArrayList<>();
        que.add(88);
        que.add(44);
        que.add(87);
        que.add(77);
        que.add(99);
        que.add(52);
        que.add(61);
        arr.add(88);
        arr.add(44);
        arr.add(87);
        arr.add(77);
        arr.add(99);
        arr.add(52);
        arr.add(61);

        Collections.sort(arr);
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(arr);
    }
}
