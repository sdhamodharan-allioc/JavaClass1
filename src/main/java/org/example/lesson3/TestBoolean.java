package org.example.lesson3;

public class TestBoolean {
    public static void main(String[] args) {
        boolean A = false;
        boolean B = true;
        boolean C = false;
        boolean result = !A && !(B && !C);

        if(!A){
            System.out.println("A Block executed");
            if(!B ){

                System.out.println("Passes through B ");
                if( !C){
                    System.out.println("Passes through C");
                }
            }
        }
    }
}
