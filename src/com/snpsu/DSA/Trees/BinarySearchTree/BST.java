package com.snpsu.DSA.Trees.BinarySearchTree;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BST {
    Node root;//if here we put null then it become hardcode and then everytime it starts with null
    BST(){
        root=null;
    }
    private Node insertRec(Node root,int  key){//helper func of insert()
        if(root==null){
            return new Node(key);
        }
        if(key<root.data){
            root.left=insertRec(root.left,key);

        }else if(key>root.data){
            root.right=insertRec(root.right,key);
        }
        return root;
    }
    void insert(int key){
        root=insertRec(root,key);
    }
    private boolean searchRec(Node root,int key){
        if(root==null){
            return false;
        }
        if(key==root.data){
            return true;
        }else if(key<root.data){
            return searchRec(root.left,key);
        }else{
            return searchRec(root.right,key);
        }

    }
    boolean search(int key){
        return searchRec(root,key);

    }
    void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    private Node removeRec(Node root,int key){
        if(root==null){
            return null;
        }
        if(key< root.data){
            root.left=removeRec(root.left,key);
        } else if (key> root.data) {
            root.right=removeRec(root.right,key);

        }else{
            //u found the node to be deleted//
            //case1:node with 0 or 1 child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case2: node with 2 children
            Node successor=findSuccessor(root.right);
            root.data=successor.data;
            root.right=removeRec(root.right,successor.data);
        }

        return root;
    }
    private Node findSuccessor(Node node){
        while(node.left!=null){
            node=node.left;
        }
        return node;

    }
    void remove(int key){
        root=removeRec(root,key);

    }
}
class Drivercode{
    static void main(String[] args) {
        BST b=new BST();
        b.insert(100);
        b.insert(50);
        b.insert(150);
        b.insert(30);
        b.insert(55);
        b.insert(60);
        b.insert(120);
        b.insert(110);
        b.insert(130);
        b.insert(180);

        System.out.println(b.search(1000));
        b.Inorder(b.root);
        //b.remove(60);
       // System.out.println();
       // b.Inorder(b.root);
        b.remove(200);
        System.out.println();
        b.Inorder(b.root);

    }
}
