package org.example.car.mechanic;

public class TestNestedIf {
    public static void main(String[] args) {
        char grade = 'A';
        if(grade == 'A')
        {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Good");
        }else if ( grade == 'C' || grade == 'D'){
            System.out.println("OK");
        }else if ( grade == 'U'){
            System.out.println("Failed");
        }else {
            System.out.println("Invalid");
        }
    }
}
