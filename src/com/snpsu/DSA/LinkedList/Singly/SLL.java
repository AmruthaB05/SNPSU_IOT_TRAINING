package com.snpsu.DSA.LinkedList.Singly;

class Node{
   int data;
   Node next;
   Node(int data){
       this.data=data;
       this.next=null;
   }
}


public class SLL {
    Node head;
    SLL(){
        head=null;
    }
    void insertAtHead(int val){

        Node n=new Node(val);

        n.next=head;
        head=n;
    }
    void insertAtTail(int val){
        Node n=new Node(val);
        if(head==null){
            head=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=n;


    }
    int gettllsize(){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
    void insertAtPos(int val,int pos){
        Node n=new Node(val);
        Node temp=head;
        int size=gettllsize();
        if(pos<0||pos>size){
            System.out.println("invalid position");
        }
        else if(pos==0){
            temp.next=head;
            head=n;
        }else{

            while(--pos>0){
                temp=temp.next;

            }
            n.next=temp.next;
            temp.next=n;
        }




    }
    void printSll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.print("null");
        System.out.println();

    }

}
class Driver4{
    static void main(String[] args) {
        SLL sll=new SLL();
        sll.insertAtTail(24);
        sll.printSll();
        sll.insertAtHead(10);
        sll.insertAtHead(12);
        sll.insertAtHead(14);
        sll.printSll();
        sll.insertAtPos(500,0);
        sll.printSll();

    }
}
