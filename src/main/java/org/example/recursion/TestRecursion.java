package org.example.recursion;


public class TestRecursion {

    /**
     *     Sum of N numbers
     *     N=1, 1
     *     N=2, 1+2 =3
     *     N=3, 1+2+3 = 6
     *     N=4, 1+2+3+4 = 10
     *     Sum(N) = sum(N-1)+N;
     *
     *
     *
    */

    public static void main(String[] args) {
        int n =4;
//        int sum = 0;
//        for(int i=1; i<=n; i++){
//            sum +=i;
//        }
//

        int sumOfN = sum(n);

    }

    /**
     *  Sum(N) = sum(N-1)+N;
     * */
    private static int sum(int n) {
        if(n ==1){
            return 1;
        }
        return n +sum(n-1);
    }
}
