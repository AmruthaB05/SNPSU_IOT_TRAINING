package com.snpsu.day3_4.opps.Abstraction.Demo.partial;

abstract class RBI {
    RBI(){

        System.out.println("RBI CONSTRUCTOR");
    }
   abstract int ROI();
   void welcome(){

       System.out.println("welcome");
   }
   static void termsAndconditionds(){

       System.out.println("Some Terms and conditions are applied");
   }
}
class HDFC extends RBI{
    HDFC(){
        System.out.println("HDFC CONSTRUCTOR");
    }
    int ROI(){
        return 8;
    }
    void welcome(){
        System.out.println("welcome HDFC");
    }
}
class SBI extends RBI{

    int ROI(){
        return 9;
    }
    void welcome(){
        System.out.println("welcome SBI");
    }
}

class Drivercode2{
    static void main() {
        HDFC h=new HDFC();
        h.welcome();
        RBI.termsAndconditionds();
        System.out.println(h.ROI());
        SBI s=new SBI();
        s.welcome();
        RBI.termsAndconditionds();
        System.out.println(s.ROI());

    }
}
