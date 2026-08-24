package com.snpsu.day3_4.methods.recursion;

public class Fibonacci {
    static int fib(int n){
          if(n==0||n==1){
              return n;
          }else{
              return fib(n-2)+fib(n-1);
          }
    }

    public static void main(String[] args) {
        int n=10;
        fib(n);
        for(int i=0;i<n;i++){
            System.out.println(fib(i));
        }

    }
}
