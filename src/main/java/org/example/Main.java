package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);

        int extProgValue = 0;
        // Initialization, Test Condition, Increment
        for(int i=0; i < extProgValue; i++){
            System.out.print(i);
            move(i);
        }

//        Inialization
//        Test Condition
//

        for(int j =5000; j >  0; j=j-100){
            System.out.println(j);
        }

        System.out.println("-------");
        int arr[] = { 10,20,30,40};
        for(Integer arrayValue: arr) {
            System.out.println(arrayValue);
        }

        int k=0;
        System.out.println("-------");
        while( k < 100) {
            System.out.println(k);
            k = k+10;

        }

    }

    private static void move(int i) {
        System.out.println("Move :"+i);
    }
}