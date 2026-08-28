package com.snpsu.Collections.Wrapperclass;

public class WrapperDemo1 {
    static void main(String[] args) {
        int x=10;
        Integer obj=new Integer(x);//manual boxing
        System.out.println("ptimitive value:"+x);
        System.out.println("Object val:"+obj);
    }
}
