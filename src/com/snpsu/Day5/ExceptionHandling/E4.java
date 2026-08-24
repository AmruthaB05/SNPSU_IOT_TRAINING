package com.snpsu.Day5.ExceptionHandling;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class E4 {
    static void main(String[] args) throws Exception{
        String i;
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i= br.readLine();
        throw new RuntimeException("no.klljl");
       // System.out.println(i);*/
       Scanner sc=new Scanner(System.in);
        i=sc.nextLine();
        System.out.println(i);
    }
}
