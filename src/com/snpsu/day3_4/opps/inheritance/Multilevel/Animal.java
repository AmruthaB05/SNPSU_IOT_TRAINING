package com.snpsu.day3_4.opps.inheritance.Multilevel;


public class Animal {
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("Barking");
    }
}
class Puppy extends Dog{
    void crying(){
        System.out.println("Crying...");
    }
}
class Drivercode{
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d =new Dog();
        Puppy p=new Puppy();

        a.eat();

        d.eat();
        d.barks();
      
        p.crying();
        p.barks();
        p.eat();
    }
}