package com.codewithme;
class Emp {
    int employeeId;
    int employeeAge;
    String employeeName;


    public void show() {
        System.out.println(employeeId +" "+ employeeAge + " "+ employeeName);
    }
}

public class ConstructorDemo {

    public static void main(String args[]){
        Emp sudhan = new Emp();
        sudhan.employeeAge = 37;
        sudhan.employeeId = 2;
        sudhan.employeeName = "Sudhan";
        Emp resham = new Emp();
        resham.employeeId = 3;
        resham.employeeAge = 35;
        resham.employeeName = "Resham";
        Emp rhythm = new Emp();
        rhythm.employeeAge = 2;
        rhythm.employeeId = 1;
        rhythm.employeeName = "Rhythm";

        sudhan.show();
        resham.show();
        rhythm.show();

    }
}
