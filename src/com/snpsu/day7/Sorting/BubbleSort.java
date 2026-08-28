package com.snpsu.day7.Sorting;

public class BubbleSort {
      static int[] bubblesort(int[] arr){
          for(int i=0;i< arr.length-1;i++){
              for(int j=i+1;j< arr.length;j++){//j=0;j<arr.length-i-1
                  if(arr[i]>arr[j]){
                      int temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                  }
              }
          }
          return arr;
      }

    static void main(String[] args) {
        int[] arr={ 100000,10000,1000,100,10,1};
        int[] res=bubblesort(arr);
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
