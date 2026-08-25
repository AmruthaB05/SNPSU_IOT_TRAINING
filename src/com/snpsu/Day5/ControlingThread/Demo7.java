package com.snpsu.Day5.ControlingThread;

public class Demo7 {

        static void main(String[] args) {
            Thread t1=new Thread(()->{
                for(int i=0;i<10;i++) {
                    System.out.println("task1 is runnning" + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            Thread t2=new Thread(()->{
                for(int i=0;i<10;i++) {
                    System.out.println("task2 is running: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t1.start();
            t2.start();
        }
    }


