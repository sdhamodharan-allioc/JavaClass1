package org.example.lesson3;

public class TestEmployee {
    public static void main(String[] args) {
        Employee kavin = new Employee("Kavin");
        Employee dhamo = new Employee("Dhamo");
        System.out.println(Employee.getEmployeeCount());
        Employee ramya = new Employee("Ramya");
        Employee elango = new Employee("Elango");
        System.out.println(Employee.getEmployeeCount());
        Employee supraja = new Employee("Supraja");
        System.out.println(Employee.getEmployeeCount());


    }
}
