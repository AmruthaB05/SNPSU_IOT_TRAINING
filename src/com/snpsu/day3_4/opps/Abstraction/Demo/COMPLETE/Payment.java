package com.snpsu.day3_4.opps.Abstraction.Demo.COMPLETE;

public interface Payment {
    void pay();
    default void refund(){
        System.out.println("Refund");
    }
    static void display(){
        System.out.println("static function");
        //hello();
    }
    private void hello(){
        System.out.println("helo");
    }
}
class UPI implements Payment{
    @Override
    public void pay() {
        System.out.println("paying through upi...");
    }

}
class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("paying thorgh creditcard");
    }
}
class Cash implements Payment{
    @Override
    public void pay() {
        System.out.println("paying through cash");
    }
}
class Drivercode{
    static void main() {
      Payment p = new UPI();
        p.pay();
        p.refund();
        Payment.display();
        Payment p1 = new Cash();
        p1.pay();
        Payment p2 = new CreditCard();
        p2.refund();

    }
}

