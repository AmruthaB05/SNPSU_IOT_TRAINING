package com.snpsu.Day5.Lambda.RunnableInterface;

public class Demo5 {
    static void main(String[] args) {
      Thread t1=new Thread(new Runnable() {
          @Override
          public void run() {
              System.out.println("task1 is running");
          }
      })  ;
      Thread t2=new Thread(new Runnable() {
          @Override
          public void run() {
              System.out.println("task2 is running");
          }
      });
      t1.start();
      t2.start();
    }
}
