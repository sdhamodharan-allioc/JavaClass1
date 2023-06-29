package org.example.car;

import java.util.Arrays;

public class TestInit {
    public static void main(String[] args) {
        //
        int age =30;
        double salary = 1098401598109584059814305983450384509345834205983240598324091234.56d;
        Integer integerAge = new Integer(20);
        System.out.println("AGe :"+ age);
        System.out.println("salary :"+ salary);
        System.out.println("AGe :"+ integerAge);
        double ageDouble = age;
        age = (int)salary;
        System.out.println("AGe after cast :"+ age);

        System.out.println("ageDouble :"+ ageDouble);





    }
}
