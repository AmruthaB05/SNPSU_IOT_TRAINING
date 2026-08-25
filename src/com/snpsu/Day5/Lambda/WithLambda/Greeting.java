package com.snpsu.Day5.Lambda.WithLambda;
interface Greeting {
    void sayHello();
}
class Demo4{
    static void main(String[] args) {
        Greeting g=()-> System.out.println("Hello world");
        g.sayHello();
    }


}
