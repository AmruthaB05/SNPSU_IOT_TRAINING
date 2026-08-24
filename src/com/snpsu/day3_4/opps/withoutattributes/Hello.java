package com.snpsu.day3_4.opps.withoutattributes;

 class Hello {
    void printHello(){

        System.out.println("hello");
    }


}
class Drivercode {
    public static void main(String[] args) {
       Hello h = new Hello();
       h.printHello();

    }
}
