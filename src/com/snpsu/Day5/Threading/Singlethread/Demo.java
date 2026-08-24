package com.snpsu.Day5.Threading.Singlethread;

public class Demo {
    static void main(String[] args) {
        System.out.println("Main thread started");
        for(int i=0;i<5;i++){
            System.out.println("main thread "+i);
        }
        System.out.println("Main thread stopped");
    }
}
