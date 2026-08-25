package com.snpsu.Day5.Lambda.RunnableInterface.Newway;

public class Demo6 {
    static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("task1 is runnning");
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("task2 is running: "+i);
            }
        });
        t1.start();
        t2.start();
    }
}
