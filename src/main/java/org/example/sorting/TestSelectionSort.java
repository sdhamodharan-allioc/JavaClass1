package org.example.sorting;

public class TestSelectionSort {
    public static void main(String[] args) {
        /**
         *
         *  23,45,11,36,72,15
         *  ---
         * Result:  11,15,23,36,45,72
         *  ---
         *  11|23,45,36,72,15
         *  11,15|23,45,36,72
         *  11,15,23|,45,36,72
         *  11,15,23,36|45,72
         *  11,15,23,36,45|,72
         *  11,15,23,36,45,72
         *  1) To identify the element i.e. lesser than anything else in the array
         *
         * ====== 1st iteration =============
         * 23,45,11,36,72,10, 15
         * smallest = 23,
         * comp(23,11) , smallest = 11
         * comp(11,36), smallest = 11
         * comp(11,72), smallest = 11
         * comp(11,15), smallest  = 11
         * 11,45,23,36,72,15
         * ------ 2nd iteration -----------
         * 45,23,36,72,15
         * comp(45,23), smallest = 23
         * comp(23,36), smallest = 23
         * comp(23,72), smallest = 23
         * comp(23,15), smallest = 15
         * swap(45,15)
         * swap(a[0], smallest)
         * 11,15,23,36,72,45
         *
         * */

        int givenArray[] = {23,45,11,36,72,15};
        int sortedArray[] = selectionSort(givenArray);
        System.out.println("adfasd");

    }

    private static int[] selectionSort(int[] givenArray) {
        for(int xCount=0; xCount < givenArray.length; xCount++){
           //
            int smallest = givenArray[xCount];
            int positionOfSmallestValue = xCount;

            //Identify the smallest
           for(int innerCount = xCount; innerCount <givenArray.length; innerCount++) {
                if(givenArray[innerCount] < smallest){
                    smallest = givenArray[innerCount];
                    positionOfSmallestValue = innerCount; //3
                }
            }

           //Swapping
            int valueInZerothPosition = givenArray[xCount]; // 23
            givenArray[xCount] = smallest; // 11
            givenArray[positionOfSmallestValue] = valueInZerothPosition; //23
        }
        return givenArray;
    }
}
