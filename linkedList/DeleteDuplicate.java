package linkedList;

public class DeleteDuplicate {
    private Node head;

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
//            this.next=null;
        }
        Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
    public void addFirst(int val){
        Node newNode=new Node(val);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void printList(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode=head;
        while (currNode != null){
            System.out.print(currNode.val+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }

    public void removeDuplicate(){
        Node currNode=head;
        while(currNode.next != null){
            if(currNode.next.val == currNode.val){
                currNode.next=currNode.next.next;
            }
            else{
                currNode=currNode.next;
            }
        }
    }

    public static void main(String[] args) {
        DeleteDuplicate list=new DeleteDuplicate();
        list.addFirst(5);
        list.addFirst(5);
        list.addFirst(5);
        list.addFirst(5);
        list.addFirst(5);
        list.addFirst(5);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3);
        list.printList();
        list.removeDuplicate();
        list.printList();
    }
}
