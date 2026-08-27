package com.snpsu.day7.Searching;

public class BinarySearch {
    static int binarySearch(int key,int[] arr){
        int f=0;
        int l=arr.length-1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(arr[mid]==key){
                return mid +1;
            } else if (arr[mid]<key) {
                f=mid+1;

            }else{
                l=mid-1;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int key=9;
        int res=binarySearch(key,arr);
        if(res!=-1){
            System.out.println("elements "+ key+"found at "+ res);
        }else{
            System.out.println("elemnt not found");
        }
    }
}
//
