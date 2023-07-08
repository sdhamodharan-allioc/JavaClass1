package org.example.sorting;

public class TestInsertionSort {
    public static void main(String[] args) {
        /**
         *          23,45,11,36,72,15
         * 23
         * 23	45
         * 11	23	45
         * 11	23	36	45
         * 11	23	36	45	72
         * 11	15	23	36	45	72
         * */

        int givenArray[] = { 23, 45, 11, 36, 72, 15};

        int insertionSortResult[] = insertionSort(givenArray);

    }

    private static int[] insertionSort(int[] givenArray) {
        int sortedArray[] = new int[givenArray.length];

        //Outer loop for each Pass
        for(int rowCount = 0; rowCount < givenArray.length; rowCount++){
            int numberToInsert = givenArray[rowCount];
            int positionToInsert = 0;

            if(rowCount == 0){
                sortedArray[rowCount] = numberToInsert;
            }else{
                //Inner loop - inserts one element at a time into the sorted list.
                // It has to make sure that it creates an empty spot
                // ,just after the number smaller than this and before the number
                // greater than this current number that we are trying to insert.
                int colCount = rowCount-1;
                for(; ( colCount >= 0 && sortedArray[colCount] > numberToInsert); colCount-- ){
                    sortedArray[colCount+1] = sortedArray[colCount];
                }

                //Insert into the empty spot.
                sortedArray[colCount+1] = numberToInsert;

            }
        }
        return sortedArray;
    }
}
