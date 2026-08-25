package com.snpsu.Day5_6.waysofCreatingThreads.RunnableInterface;

 class ex1 implements Runnable {//this is task
     @Override
     public void run() {
         System.out.println("Thread is running1");
     }
 }
class ex2 implements Runnable {//this is task
    @Override
    public void run() {
        System.out.println("Thread is running2");
    }
}
 class Demo2{
     static void main(String[] args) {
         ex1 t=new ex1();
         ex2 ta=new ex2();
         Thread t1=new Thread(t);
         Thread t2 = new Thread(ta);
         t2.start();
         t1.start();
         System.out.println("main thread is running");
     }
 }
