package org.example.car;

public class TestSumOfN {
    public static void main(String[] args) {
        int sumOfN = 0;

        /**
         * i=0, sumOfN = 0, sumOfN = sumOfN + i
         * i=0, sumOfN = 0;
         * i =1; sumOfN = 1;
         * i = 2; sumOfN = 3;
         *
         * */
        for(int i=0; i < 10; i++){
            sumOfN += i; // sumOfN = sumOfN + i
        }

    }
}
