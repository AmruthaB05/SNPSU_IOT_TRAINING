package com.snpsu.day3_4.opps.inheritance.superkey;

public class Person {
    String Fname;
    String Lname;
    Person( String Fname,String Lname){
        this.Fname=Fname;
        this.Lname=Lname;
            System.out.println(Fname);
            System.out.println(Lname);

    }
}
class Student extends Person{
    int rollno;
    Student( String Fname,String Lname,int rollno){
        super(Fname, Lname);
        this.rollno=rollno;

            System.out.println(Fname);
            System.out.println(Lname);
            System.out.println(rollno);

    }
}
class Drivercode{
    public static void main() {
        Person p=new Person("amrutha","reddy");
        Student s= new Student("amr","red",12);


    }
}

