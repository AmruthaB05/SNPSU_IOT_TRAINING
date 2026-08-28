package com.snpsu.Strings;

public class StringBufferExample {

    static void main(String[] args) {
        StringBuffer sbf=new StringBuffer("Hello");
        System.out.println(sbf);
        //System.out.println(sbf.lastIndexOf("Hello"));
        sbf.append(" world");
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf);
        sbf.insert(5,"A");
        System.out.println(sbf);
        sbf.replace(5,6,"i");
        System.out.println(sbf);
        System.out.println(sbf.length());
        sbf.delete(0,12);
        System.out.println(sbf);
        sbf.append("Amrutha ");
        System.out.println(sbf);
        System.out.println(sbf.length());
        sbf.replace(7,8,"B");
        System.out.println(sbf);
        sbf.replace(6,7,"A");
        System.out.println(sbf);
    }
}
