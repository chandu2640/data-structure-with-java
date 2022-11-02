package Extra;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinTree {
    static Scanner sc=new Scanner(System.in);

    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    static Node createTree(){
        int val=sc.nextInt();
        Node root=new Node(val);
        if(val==-1) return null;

        root.left=createTree();
        root.right=createTree();

        return root;
    }

    static void printTree(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }
    static void levelOrderPrint(Node root){
        Queue<Node> que=new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            Node temp=que.remove();
            System.out.println(temp.val);

            if(temp.left != null){
                que.add(temp.left);
            }
            if(temp.right != null){
                que.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root=createTree();
        printTree(root);
        levelOrderPrint(root);
    }
}
