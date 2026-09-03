package com.snpsu.DSA.Queues;

public class Queue {
    int[] arr;
    int front;
    int back;
    int size;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        back=-1;
    }
    void push(int val){
        if(back==size-1){
            System.out.println("overfloww..");
            return;
        }
        back++;
        arr[back]=val;
        if(front==-1){
            front++;
        }
    }
    void pop(){
        if(front==-1|| front>back){
            System.out.println("underflow...");
            return;
        }
        arr[front]=0;
        front++;
    }
    int peek(){
        if(front==-1|| front>back){
            System.out.println("underflow...");
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty(){
        return(front==-1||front>back);
    }
}
class Code1{
    static void main(String[] args) {
        Queue q=new Queue(10);
        q.push(10);
        q.push(12);
        q.push(13);
        q.push(45);
        q.push(456);
        q.push(89);
        q.push(90);
        q.push(4567);
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());


    }
}
