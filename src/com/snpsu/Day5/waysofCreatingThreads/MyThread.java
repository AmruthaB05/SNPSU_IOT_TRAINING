package com.snpsu.Day5.waysofCreatingThreads;

public  class MyThread extends Thread{

        public void run() {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Mythread "+i);
            }
        }


}
class Demo1{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for (int i = 1; i <= 2; i++) {
            System.out.println("main thread is running"+i);
            //t1.run();
        }
    }
}
