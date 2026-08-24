package com.snpsu.day3_4.opps.inheritance.herarchical;

public class Animal {
    void eat(){
        System.out.println("eating..");
    }
}
 class Dog extends Animal{
    void bark(){
        System.out.println("barking..");
    }
 }
 class Cat extends Animal{
    void meow(){
        System.out.println("meowing..");
    }
 }
 class Drivercode{
     public static void main(String[] args) {
         Animal a=new Animal();
         Dog d=new Dog();
         Cat c=new Cat();
         a.eat();
        a.eat();
        a.eat();
     }
 }
