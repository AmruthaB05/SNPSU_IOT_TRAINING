package com.snpsu.day3_4.opps.constructor;

public class Student {
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    //copy constructor:which is used to make a copy of another obj
    Student(Student s1){
        this.name=name;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        Student s1 = new Student("amrutha",12);
        Student s2 = new Student(s1);
      //  s2.rollno=112;
       // s2.name="Amrutha";

        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1==s2);
        System.out.println(s2.name);
        System.out.println(s2.rollno);
    }
}
