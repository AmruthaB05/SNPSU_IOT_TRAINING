package com.snpsu.day3_4.opps.Polymorphism.Runtime;

 public class Mom {
    void cook(){
        System.out.println("Indian...");
    }
}
class Daughter extends Mom{
    /*void cook(){
        System.out.println("chineeese..");
    }*/
}
class Drivercode{
    static void main() {
        Mom m=new Mom();
        Daughter d=new Daughter();
        d.cook();
        m.cook();
    }
}

