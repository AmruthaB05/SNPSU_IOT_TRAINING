package com.snpsu.methods;

public class callByValue {
    //swapping every where
   /* void swap(int[] arr){
          int temp = arr[0];
          arr[0]=arr[1];
          arr[1]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {10,20};
        callByValue c = new callByValue();
        c.swap(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }*/
    //swapping inside function only
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a =10;
        int b=20;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
