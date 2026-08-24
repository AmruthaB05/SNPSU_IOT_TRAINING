package com.snpsu.Day5.ExceptionHandling;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }

}
class Drivercode{

    static void main(String[] args)throws Exception {
        int age=20;
        if(age<18){
            throw new InvalidAgeException("Age must be over 18");
        }
    }
}
