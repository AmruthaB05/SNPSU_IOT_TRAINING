package com.snpsu.Day5.ExceptionHandling;
//inbuilt exception
public class E3 {
    static void main() {
        int age = 10;
        if(age>=18){
            System.out.println("eligible acces granted");
        }else{
            throw new RuntimeException("not eligible-acess denied");
        }
    }
}
