package org.example.car;

public class TestSwitch {
    public static void main(String[] args) {
        char grade = 'A';
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
            case 'D':
                System.out.println("OK");
                break;
            case 'U':
                System.out.println("Failed");
            default:
                System.out.println("Invalid");
        }
    }
}
