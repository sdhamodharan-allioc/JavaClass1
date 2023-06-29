package org.example;

import java.util.Scanner;

public class TestSentinel {
    public static void main(String[] args) {
        int value = 0;
        final int SENTINEL = -999;
        while(value != SENTINEL){
            //Code to Process value.
            processValue(value);

            //Read User Input.
            value = getUserInput();
        }
    }

    private static int getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");
        return input.nextInt();
    }

    private static void processValue(int value) {
        System.out.println("Process : "+value);
    }
}
