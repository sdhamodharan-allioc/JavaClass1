package org.example.optimization;

public class TestOptimization {
    public static void main(String[] args) {
        int arr[] = {51,25,33,41, 10};
        int arr2[] = { 10, 25, 33, 41, 55};

        //search for 55.
        // 33 --> Go right. 41 --> Go right.

        //Search for 25.
        // 25 <-- Go left 33

        // search for 51. - Best case scenario is the number is in the first location itself.
        // search for 10. - Worst case - Its in the end.
        // search for 33 - Avg case.
    }
}
