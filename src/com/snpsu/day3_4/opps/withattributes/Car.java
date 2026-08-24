package com.snpsu.day3_4.opps.withattributes;

public class Car {
    String brand;
    int mandata;
    Car(String brand,int mandata){//car(String b,int mDta)
        this.brand=brand;        //brand=b;
        this.mandata=mandata;//    mandata=mDta;
    }
    void printDetails(){
        System.out.println("car brand:"+brand+" "+"MANdate:"+mandata);//brand,mandata not b,mDta
    }

    public static void main(String[] args) {
        Car c1=new Car("BMW",2000);

        c1.brand="Toyota";
        c1.printDetails();
    }
}
