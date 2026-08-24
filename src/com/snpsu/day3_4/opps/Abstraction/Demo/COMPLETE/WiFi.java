package com.snpsu.day3_4.opps.Abstraction.Demo.COMPLETE;

public interface WiFi {
    void connect();

}
class Lapthop implements WiFi{
    public void connect(){
        System.out.println("Laptop connected to wifi");
    }
}
class Phone implements WiFi{
    public void connect(){
        System.out.println("phone is connected");
    }
}
class Drivercode2 {
    static void main() {
        WiFi w = new Lapthop();
        w.connect();
        WiFi phone = new Phone();
        phone.connect();
    }
}

