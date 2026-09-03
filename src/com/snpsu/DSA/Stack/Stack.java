package com.snpsu.DSA.Stack;

public class Stack {
    int[] arr;
    int top;
    int size;
    Stack(int size){
        this.size=size;
        top=-1;
        arr=new int[size];
    }
    void push(int val){
        if(top==size-1){
            System.out.println("overflow...");
            return;

        }
        top++;
        arr[top]=val;
    }
    void pop(){
        if(top==-1){
            System.out.println("underflow...");
            return;
        }
        arr[top]=0;
        top--;

    }
    int Top(){
        if(top==-1){
            System.out.println("underflow...");
            return -1;
        }
        return arr[top];
    }
    boolean Empty(){
        if(top==-1){
            return true;

        }
        return false;
    }
}
class Code{
    static void main(String[] args) {
        Stack s=new Stack(10);
        s.push(12);

        System.out.println(s.Top());
        s.pop();
        System.out.println(s.Empty());
        s.pop();
        s.pop();
        System.out.println(s.Top());
    }
}
