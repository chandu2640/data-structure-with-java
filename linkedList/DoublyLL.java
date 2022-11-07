package linkedList;

public class DoublyLL {
    Node head;
    class Node{
        int value;
        Node next;
        Node prev;

        Node(int val){
            this.value=val;
        }
    }

    public void addFirst(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        head.prev=null;
    }

    public void printList(){
        if(head==null){
            System.out.println("The list is Empty");
        }
        Node currNode=head;
        while (currNode != null){
            System.out.println(currNode.value);
            currNode=currNode.next;
        }
    }

    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.addFirst(2);
        list.addFirst(3);
        list.printList();
    }

}
