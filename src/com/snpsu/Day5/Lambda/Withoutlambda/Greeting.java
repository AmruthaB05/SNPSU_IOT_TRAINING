package com.snpsu.Day5.Lambda.Withoutlambda;

public interface Greeting {
    void sayHello();
}
class Demo3{
    static void main(String[] args) {
        Greeting g=new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("hello world");
            }
        };
        g.sayHello();
    }
}