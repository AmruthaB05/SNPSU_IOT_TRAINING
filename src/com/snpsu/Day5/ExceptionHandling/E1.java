package com.snpsu.Day5.ExceptionHandling;

public class E1 {
    public static void main() {
        int i,j,k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            int[] arr={1,2,3,4};
            System.out.println(arr[10]);
        }catch(ArithmeticException e){
            System.out.println("cant divide by 0");
        }//catch (ArrayIndexOutOfBoundsException e){
           // System.out.println("wrong index");}
        catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("this willnexcdethggng");
        }

        //System.out.println(k);
    }
    static {
        System.out.println("excetution starts");
    }
}
