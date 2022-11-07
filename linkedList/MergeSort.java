package linkedList;

public class MergeSort {
    ListNode head;

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
            this.next=null;
        }
        public ListNode() {}
    }

    public void addFirst(int val){
        ListNode newNode=new ListNode(val);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(){
        if (head==null){
            System.out.println("The List is Empty");
            return;
        }
        ListNode currNode=head;
        while(currNode != null){
            System.out.println(currNode.val);
            currNode=currNode.next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList=new ListNode();
        ListNode list=newList;

        while(list1 != null && list2 != null){
            if(list1.val<list2.val){
                list.next=list1;
                list1=list1.next;
            }
            else{
                list.next=list2;
                list2=list2.next;
            }
            list=list.next;
        }
        while(list1 != null){
            list.next=list1;
            list1=list1.next;
            list=list.next;
        }
        while(list2 != null){
            list.next=list2;
            list2=list2.next;
            list=list.next;
        }
        return newList.next;
    }
    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode midPart=getMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(midPart);

        return mergeTwoLists(left,right);
    }


    public static void main(String[] args) {
        MergeSort list=new MergeSort();
        list.addLast(-1);
        list.addLast(5);
        list.addLast(3);
        list.addLast(4);
        list.addLast(0);
        list.printList();
        list.sortList(list.head);
        list.printList();
//        list.mid(list.head);
    }
}
