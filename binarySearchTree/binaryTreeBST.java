package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class binaryTreeBST {
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
    static Node insertIntoBST(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val< root.val){
            root.left=insertIntoBST(root.left,val);
        }
        else{
            root.right=insertIntoBST(root.right,val);
        }


        return root;
    }

    static void levelOrder(Node root){
        Queue<Node> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node temp=que.remove();
            System.out.print(temp.val+" ");

            if(temp.left != null){
                que.add(temp.left);
            }

            if(temp.right != null){
                que.add(temp.right);
            }
        }
    }

    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    static Node createTree(){
        System.out.println("Enter the data: ");
        int val=sc.nextInt();
        Node root=null;
        while(val != -1){
            root=insertIntoBST(root,val);
            val=sc.nextInt();
        }
        return root;
    }

    public static void main(String[] args) {
        Node root=createTree();
        levelOrder(root);
        System.out.println();
        inOrder(root);
    }
}
