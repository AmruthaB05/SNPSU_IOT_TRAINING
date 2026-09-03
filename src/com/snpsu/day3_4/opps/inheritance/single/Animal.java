package com.snpsu.day3_4.opps.inheritance.single;

public class Animal {//parent class
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{//child class
    void barks(){
        System.out.println("Barking");
    }
}
class Drivercode{
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d =new Dog();
        a.eat();
        d.eat();
        d.barks();
    }
}

