package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class binarySearchTree {
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

    static void preOrderPrint(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }

    static Node insertIntoBST(Node root, int data){
        if (root==null){
            root=new Node(data);
            return root;
        }
        if(data < root.val){
            root.left=insertIntoBST(root.left,data);
        }
        else{
            root.right=insertIntoBST(root.right, data);
        }

        return root;
    }

    static Node createBST(){
        Node root=null;
        int data=sc.nextInt();
        while(data != -1){
            root=insertIntoBST(root, data);
            data=sc.nextInt();
        }
        return root;
    }


    public static void main(String[] args) {
        Node root=createBST();
        levelOrderPrint(root);
    }


}
