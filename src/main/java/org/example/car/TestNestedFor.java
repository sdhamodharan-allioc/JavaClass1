package org.example.car;

public class TestNestedFor {
    public static void main(String[] args) {
        // 1 * 1 = 1
        // 1 * 2 = 2
        int number=1, multiplier=1, product=0;
        for(number =1; number <= 12; number++) {
            System.out.println("--------------");
            for (multiplier = 1; multiplier <= 12; multiplier++) {
                product = number * multiplier;
                System.out.println(number + " x " + multiplier + " = " + product);
            }
            System.out.println("--------------");
        }
    }
}
