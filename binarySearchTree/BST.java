package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BST {
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

    static Node createBST(){
        System.out.println("Enter the Data: ");
        int val=sc.nextInt();
        Node root=null;
        while(val != -1){
            root=insertIntoBST(root,val);
            val=sc.nextInt();
        }
        return root;
    }

    static void preOrderPrint(Node root){
        if(root==null){
            return;
        }
        preOrderPrint(root.left);
        System.out.print(root.val+" ");
        preOrderPrint(root.right);
    }
    static int maxValue(Node root){
        Node temp=root;
        while(temp.right !=null){
            temp=temp.right;
        }
        return temp.val;
    }

    static int minValue(Node root){
        Node temp=root;
        while(temp.left != null){
            temp=temp.left;
        }
        return temp.val;
    }

//    static Node deleteValue(Node root, int x){
//        if (root==null) return root;
//        if(root.val==x){
//            return root;
//            //0 child
//            if(root.left==null && root.right==null) {
//                return null;
//            }
//
//            //1 child
//            //Left child only
//            else if(root.left != null && root.right==null){
//                Node temp=root.left;
//                root=null;
//                return temp;
//            }
//            //Right child Only
//            else if(root.left==null && root.right != null){
//                Node temp=root.right;
//                root=null;
//                return temp;
//            }
//            //2 child
//        }
//        if(x<root.val){
//            root.left=deleteValue(root.left,x);
//        }
//        else{
//            root.left=deleteValue(root.right,x);
//        }
//        return root;
//    }


    public static void main(String[] args) {
        Node root=createBST();
//        levelOrderPrint(root);
//        System.out.println();
//        preOrderPrint(root);
//        System.out.println();
        System.out.println(maxValue(root));
        System.out.println(minValue(root));
//        levelOrderPrint(deleteValue(root,12));
    }
}
