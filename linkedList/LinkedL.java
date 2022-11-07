package linkedList;

public class LinkedL {
    private Node head;
    private Node tail;
    private int size;

    LinkedL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next != null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }


    public void printList(){
        Node currentNode=head;
        if(head==null){
            System.out.println("List is Empty.");
            return;
        }
        while(currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
        System.out.println();
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty.");
            return;
        }
        head=head.next;
        size--;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty.");
            return;
        }
        size--;
        if(head.next == null){
            head=null;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void getSize(){
        System.out.println(this.size);
    }

    public static void main(String[] args) {
        LinkedL list=new LinkedL();
        list.addFirst("apple");
        list.addFirst("is");
        list.addFirst("good");
        list.addLast("for");
        list.addLast("health");
        list.printList();
        list.getSize();
        list.deleteLast();
        list.printList();
        list.getSize();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        list.getSize();
    }
}
