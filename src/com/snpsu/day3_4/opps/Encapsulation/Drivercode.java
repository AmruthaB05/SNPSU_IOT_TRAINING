package com.snpsu.day3_4.opps.Encapsulation;

class Employee {
    private String empName;
   private int empId;
    Employee(String empName,int empId){
        this.empName=empName;
        this.empId=empId;
    }
    String getEmpName(){

        return empName;
    }
    int getEmpId(){
        return empId;
    }
    void setEmpName(String empName){
        this.empName=empName;
    }
    void setEmpId(int eid){
        empId=eid;
    }
    void printDetails(){
        System.out.println("employee name= "+this.empName);
        System.out.println("employee ID= "+this.empId);
    }

}
public class Drivercode{
    static void main() {
        Employee e=new Employee("Amrutha",12);
        e.printDetails();

        System.out.println( e.getEmpName());
        System.out.println(e.getEmpId());
         e.setEmpName("reddy");
         e.setEmpId(120);
        System.out.println( e.getEmpName());
        System.out.println(e.getEmpId());
        e.printDetails();
    }
}
