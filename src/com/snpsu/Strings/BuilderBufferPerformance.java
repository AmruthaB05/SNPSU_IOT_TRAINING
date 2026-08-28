package com.snpsu.Strings;

public class BuilderBufferPerformance {
    static void main(String[] args) {
        long startTime=System.currentTimeMillis();

        StringBuffer sbf=new StringBuffer("SNPSU");
        for(int i=0;i<100;i++){
            sbf.append("Institution");

        }
        System.out.println("Time taken by string buffer: "+ (System.currentTimeMillis()-startTime)+"ms");
        startTime=System.currentTimeMillis();
        StringBuilder sbl=new StringBuilder("SNPSU");
        for(int i=0;i<100;i++){
            sbl.append("Institution");
        }
        System.out.println("Time taken by string builder: "+ (System.currentTimeMillis()-startTime)+"ms");
    }
}
