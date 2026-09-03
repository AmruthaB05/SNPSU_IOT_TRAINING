package com.snpsu.DSA.LinkedList.Double;



class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev=null;
    }
}
public class Deque {
    Node head;
    Deque(){
        head=null;

    }
    void insertAtHead(int val){
        Node n=new Node(val);
        if(head!=null){
            n.next=head;
            head.prev=n;
        }
        head=n;
    }
    void insertAtTail(int val){
        Node n=new Node(val);
        if(head==null){
            head=null;

            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        n.prev=temp;
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
        int size= gettllsize();
        Node n=new Node(val);
        Node temp=head;
        if(pos<0||pos>size){
            System.out.println("invalid");

        }
        else if(pos==0){
            temp.next=head;
            head=n;
        }else{

            while(--pos>0){
               temp=temp.next;
            }
            n.next=temp.next;
            n.prev=temp;
            if(temp.next!=null){
                temp.next.prev=n;
            }
            temp.next=n;
        }
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("Empty..");
            return;
        }
        Node todel=head;
        head=head.next;

        if(head!=null){
            head.prev=null;
        }
        todel=null;
    }
    void deleteByvlaue(int val){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if(head.data==val){
            Node todelet=head;
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            todelet=null;
        }
        Node temp=head;
        while(temp!=null&&temp.next!=null){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("element not found..");
            return;
        }
        temp.prev.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
    }



    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

}
class Driver3{
    static void main(String[] args) {
        Deque d=new Deque();
        d.insertAtHead(12);
        d.insertAtHead(56);
        d.insertAtHead(123);
        d.display();
        d.insertAtTail(34);
        d.display();
        d.insertAtPos(90,3);
        d.display();
        d.deleteAtHead();
        d.display();
        d.deleteByvlaue(23);

    }
}

