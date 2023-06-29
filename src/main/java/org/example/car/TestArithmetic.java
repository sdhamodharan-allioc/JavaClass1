package org.example.car;

public class TestArithmetic {
    public static void main(String[] args) {
        System.out.println("-----------Starts-----");

        int a = 20;
        int b = 30;

        int sum = a + b;
        int diff = b -a;
        int product = a * b;
        float quotient = (float) b /(float) a;

        //Relational
        int age = 18;
        if(age > 17) {
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }


        //Logical - NOT = !
        boolean carKeyFound = false;
        carKeyFound = searchForMyCarKey();
        if(!carKeyFound){
            System.out.println("Take a break. Have some coffee Relax");
        boolean showRoomOpen = false;
            if(showRoomOpen){
                System.out.println("Sorry.Missing. Order a new one.");
            }else{
                System.out.println("Order online");
            }

            System.out.println("adasdds");
        }else{
            System.out.println("Thank God!");
        }


        //AND  -> &&
        /**
         *
         * condition1 = true, condition2 = true, result = true
         * condition1 = true, condition2 = false, result = false
         * condition1 = false, condition2 = true, result = false
         * condition1 = false, condition2 = false, result = false
         *
         * */
        int gradePointAvg = 5;
        int numberOfAPClasses = 7;

        if( gradePointAvg >= 5 || numberOfAPClasses > 8){
            System.out.println("Eligible for League Universities");
        }else{
            System.out.println("Not eligible for league Universities");
        }

        //Assignment operator
        int count = 1;
        count += 5; // count = count + 5

        System.out.println("-----------Ends-----");

        int sumOfN = 0;
        for(int i = 0; i < 10; i++){
            sumOfN += i;
        }

    }

    /**
     * return false - for not found.
     * */
    private static boolean searchForMyCarKey() {
        return true;
    }
}
