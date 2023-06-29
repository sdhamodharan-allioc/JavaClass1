package org.example.car;

public class TestCheckedException {
    public static void main(String[] args) throws Exception {
        int a = 3;
        int b = 0;//getSalary();

        int d = 0;
        try{
            System.out.println("Try getting scholarship block");
            d = a/b;
            ///
            ////


        }catch(Exception e) {
            System.out.println("Catch - Get loan block");
            e.printStackTrace();
            d = 10; // Govt Aid.
            throw new Exception("Unable to get Loan!");
        }finally {
            System.out.println("Finally - Graduated block");
        }

        System.out.println("Did the program reach here?");
        calculateMonthlyInvest(d);
    }

    private static void calculateMonthlyInvest(int d) {
    }

    private static int getSalary() {
        return 1000;
    }
}
