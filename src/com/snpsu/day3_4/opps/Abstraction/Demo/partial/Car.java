package com.snpsu.day3_4.opps.Abstraction.Demo.partial;

abstract class Car {
   abstract void start();
    void brake(){
        System.out.println("car stops");
    }
}
class Bmw extends Car{
    void start(){
        System.out.println("BMW IS STARTING");
    }
}
class Drivercode{
    static void main() {
       Bmw b=new Bmw();
       b.start();
       b.brake();

    }
}
