package ll;

public class LL {
    public Node head;
    static int size;
    int size(){
        return size;
    }
    LL(){
        this.size=0;
    }
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
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int val){
        Node newNode=new Node(val);
        size++;
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
        if(head==null){
            System.out.println("Nothing to print. List is Empty.");
            return;
        }
        Node currNode=head;
        while (currNode != null){
            System.out.print(currNode.val+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("Nothing to Delete. List is Empty.");
            size--;
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("Nothing to Delete. List is Empty.");
            size--;
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        size--;
        Node lastElement=head.next;
        Node secondLastElement=head;
        while(lastElement.next != null){
            lastElement=lastElement.next;
            secondLastElement=secondLastElement.next;
        }
        secondLastElement.next=null;
    }
    public void add(int index, int val){
        if(index>size()){
            System.out.println("Index out of Bound");
            return;
        }
        size++;
        if(index==size()){
            addLast(val);
            return;
        }
        Node newNode= new Node(val);

        Node startNode=head;
        int count=0;
        while(count != index-1){
            startNode=startNode.next;
            count++;
        }
        newNode.next=startNode.next;
        startNode.next=newNode;
    }
    public void deleteNode(int val){
        if(head==null){
            System.out.println("The list is Empty, Nothing to delete");
            return;
        }

        if(head.val==val){
            head=head.next;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            if(currNode.next.val == val){
                currNode.next=currNode.next.next;
                return;
            }
            else{
                currNode=currNode.next;
            }
        }
        System.out.println("Node not found");
    }

    public static void main(String[] args) {
        LL list=new LL();
        int[] arr={1,2,3,4,5,6,7,8,9};
        for(int num: arr){
            list.addLast(num);
        }
        int a=5;
        int b=a++ * 3;
        System.out.println(b);
        list.printList();
        list.deleteNode(6);
        list.printList();
    }
}
