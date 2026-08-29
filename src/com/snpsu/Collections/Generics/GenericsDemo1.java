package com.snpsu.Collections.Generics;

import java.util.ArrayList;

public class GenericsDemo1 {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
       // list.add("Amrutha"); due to generics compile time error
        list.add(10);
    }
}
