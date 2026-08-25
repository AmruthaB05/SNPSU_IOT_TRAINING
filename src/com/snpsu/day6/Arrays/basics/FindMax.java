package com.snpsu.day6.Arrays.basics;

public class FindMax {
    static void main(String[] args) {
        int[] arr={5,12,7,15,13,2};
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("maximum is: "+max);
    }
}
