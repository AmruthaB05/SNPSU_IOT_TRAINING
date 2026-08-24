package com.snpsu.day3_4.opps.Polymorphism.Compiletime;

public class Addition {
    int add(int a,int b){
        return a+b;
    }
    float add(float a,int b,int c){
       return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }


}
class Drivercode{
    static void main() {
        Addition a = new Addition();
        System.out.println(a.add(1,4));
        System.out.println(a.add(3,6));
        System.out.println(a.add(4.0f,8,-1));
        System.out.println(a.add(1.3f,3.4f));
    }
}
