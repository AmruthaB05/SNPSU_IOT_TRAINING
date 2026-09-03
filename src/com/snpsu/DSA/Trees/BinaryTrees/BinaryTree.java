package com.snpsu.DSA.Trees.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
   int data;
   Node left;
   Node right;
   Node(int data){
       this.data=data;
       this.right=null;
       this.left=null;
   }
}
public class BinaryTree {
   static  Node createNode(int val){//returns node

       return new Node(val);
    }
//DFS traversal
    static void DFS(Node root){
       if(root==null){
           return;
       }
        System.out.print(root.data+" ");//here then it is preorder

        DFS(root.left);
        //System.out.print(root.data+" ");here then its inorder

        DFS(root.right);
       // System.out.print(root.data+" ");  here then it is postorder

    }

//BFS traversal
    static void BFS(Node root){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node front=q.poll();
            System.out.print(front.data+" ");
            if(front.left!=null){
               q.offer(front.left);
            }
            if(front.right!=null){
                q.offer(front.right);
            }
        }
    }
    static int height(Node root){
       if(root==null){
           return 0;
       }
       int leftHeight=height(root.left);
       int rightHeight=height(root.right);
       return Math.max(leftHeight,rightHeight)+1;
    }


    static void main(String[] args) {
       //level1
        Node root = createNode(1);//root node is created similar as head in linkedlist
        //level2
        root.left=createNode(2);
        root.right=createNode(3);
        //level3
        root.left.left=createNode(4);
        root.left.right=createNode(5);
        root.right.left=createNode(6);
        root.right.right=createNode(7);
        //level4
        root.left.right.left=createNode(8);
        root.right.left.left=createNode(15);
        root.right.left.right=createNode(9);
        DFS(root);
        System.out.println();
        BFS(root);
        System.out.println();
        System.out.println(height(root));

    }
}
