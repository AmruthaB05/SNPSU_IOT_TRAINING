package com.snpsu.day7.Searching;

public class LinearSearch {
    static int linearSearch(int [] arr,int key){
         for(int i=0;i< arr.length;i++){
             if(arr[i]==key){
                 return i;
             }
         }
         return -1;
    }
    public static void main(String[] args) {
           int[] arr={6,8,9,1,2,4,17};
           int key=16;
          int res=linearSearch(arr,key);
          if(res!= -1){
              System.out.println("elements "+ key+" found");
          }else{
              System.out.println("element "+key+"not found" );
          }
          /*
          best=o1
          worst=on;
           */
    }
}
