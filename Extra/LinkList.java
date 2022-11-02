package Extra;

public class LinkList {
    Node head;
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
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
    public void addLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.val+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;
        while(currNode.next.next != null){
            currNode=currNode.next;
        }
        currNode.next=null;
    }

    public static void main(String[] args) {
        LinkList list=new LinkList();
        list.addFirst(5);
        list.addFirst(4);
        list.addLast(6);
        list.addLast(7);
        list.printList();
    }
}
