package com.snpsu.day3_4;

public class Recursion {
    //infinte recusion
   /* static void function(){
        System.out.println("hi");
        function();
    }

    public static void main(String[] args) {
        function();
    }*/
    static void function(int n){
        if(n==100){
            return;
        }
        System.out.println(n);//main body
        function(n+1);//recursive call
    }

    public static void main(String[] args) {
        function(10);//function call
    }

}
