package com.snpsu.Day5.ExceptionHandling;

public class E2 {
    static void main() {
        int i,j,k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            int[] arr={1,2,3,4};
            System.out.println(arr[10]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
}
