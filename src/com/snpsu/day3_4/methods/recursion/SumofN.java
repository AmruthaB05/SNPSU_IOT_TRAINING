package com.snpsu.day3_4.methods.recursion;

public class SumofN {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+ sum(n-1);
        }


    }

    public static void main(String[] args) {
        int num=5;
        int res=sum(num);
        System.out.println(res);
    }
}
