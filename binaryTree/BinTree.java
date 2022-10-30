package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class BinTree {
    static Scanner sc = new Scanner(System.in);
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
        if(val==-1){
            return null;
        }
//        System.out.println("Enter left child of "+val);
        root.left=createTree();
//        System.out.println("Enter right child of "+val);
        root.right=createTree();

        return root;
    }

    static void preOrderPrint(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }
    static void inOrderPrint(Node root){
        if(root==null){
            return;
        }
        inOrderPrint(root.left);
        System.out.print(root.val+" ");
        inOrderPrint(root.right);
    }
    static void postOrderPrint(Node root){
        if(root==null){
            return;
        }
        postOrderPrint(root.left);
        postOrderPrint(root.right);
        System.out.print(root.val+" ");
    }

    static void levelOrderPrint(Node root){
        Queue<Node> que=new LinkedList<>();
        que.add(root);
//        System.out.println(root.val);
        while (!que.isEmpty()){
            Node temp=que.remove();
            System.out.print(temp.val+" ");

            if(temp.left!=null){
                que.add(temp.left);
            }
            if(temp.right != null){
                que.add((temp.right));
            }
        }
    }



    public static void main(String[] args) {
        Node tree=createTree();
        preOrderPrint(tree);
        System.out.println();
        inOrderPrint(tree);
        System.out.println();
        postOrderPrint(tree);
        System.out.println();
        levelOrderPrint(tree);
    }

}
