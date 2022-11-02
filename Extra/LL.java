package Extra;

public class LL {
    private Node head;
    private int size;

    LL(){
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
        if(head == null){
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
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void add(String data,int index){
        Node newNode=new Node(data);
        size++;
        if(index==0){
            this.addFirst(data);
            return;
        }
        else if(index==this.getSize()-1){
            this.addLast(data);
            return;
        }
        else if(index<this.getSize()){
            Node currNode=head;
            for(int i=0; i<index-1; i++){
                currNode=currNode.next;
            }
            newNode.next=currNode.next;
            currNode.next=newNode;
        }
    }

    public void printList(){
        if(head==null){
            System.out.println("The list id Empty.");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list id Empty.");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The list id Empty.");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }


    public void delete(int index){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        else if(index>this.getSize()-1){
            System.out.println("Index out of Bound");
            return;
        }
        if(index==0){
            this.deleteFirst();
            return;
        }
        if(index==this.getSize()-1){
            this.deleteLast();
            return;
        }

        Node currNode=head;
        for(int i=0; i<index-1; i++){
            currNode=currNode.next;
        }
        currNode.next=currNode.next.next;
    }
    private int getSize(){
        return this.size;
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("Apple");
        list.addFirst("ball");
        list.addFirst("cat");
        list.addLast("Dog");
        list.addLast("Egg");
        list.printList();
        System.out.println(list.getSize());
        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.add("Mighty",2);
        list.printList();
        list.delete(1);
        list.printList();
    }
}
