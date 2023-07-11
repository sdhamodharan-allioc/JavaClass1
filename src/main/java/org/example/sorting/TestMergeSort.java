package org.example.sorting;

public class TestMergeSort {

    /**[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     * [23,34,56,11,20,12,17,48,37,14]
     * Split until you have only one element in each sub array.
     * [23,34,56,11,20] [12,17,48,37,14]
     * [23,34,56] [11,20] [12,17,48] [37,14]
     * [23,34] [56] [11] [20] [12,17] [48] [37] [14]
     * [23] [34] [56] [11] [20] [12] [17] [48] [37] [14]
     *
     * Merge the adjacent arrays and also sort them
     * [23,34] [56] [11,20] [12,17] [48] [14,37]
     * ( While merging, merge in the same order as you did the split )
     * [23,34,56] [11,20] [12,17,48] [14,37]
     * [11,20,23,34,56] [12,14,17,37,48]
     * [11,12,14,17,20,23,34,37,48,56]
     *
     * */
    public static void main(String[] args) {
        int givenArray[] = { 23, 34, 56, 11, 20, 12, 17, 48, 37, 14 };
        int arrayLength = givenArray.length;
        sort(givenArray, 0, arrayLength-1);
        System.out.println("Merged array");
    }

    private static void sort(int[] givenArray, int startIndex, int endIndex) {
        if(startIndex != endIndex){
            //1. Find the middle point
            int middleIndex = ( startIndex + endIndex) /2; // (9+0)/2 = 4

            // 2. Sort the first half
            sort(givenArray, startIndex, middleIndex);

            // 3. Sort the second half
            sort(givenArray, middleIndex+1, endIndex);

            // 4. Merge the two halves.
            merge(givenArray, startIndex, middleIndex, endIndex);


        }else{
            System.out.println("Single Element. Hence return" + givenArray[startIndex]);
            return;
        }

    }

    private static void merge(int[] givenArray, int startIndex, int middleIndex, int endIndex) {

        // 1. Find the size of each half
        int sizeOfFirstHalf = middleIndex - startIndex+1;
        int sizeOfSecondHalf = endIndex - middleIndex;

        //2. Create temporary arrays
        int leftArray[] = new int[sizeOfFirstHalf];
        int rightArray[] = new int[sizeOfSecondHalf];

        //3. Copy data to temporary arrays
        for(int leftCount = 0; leftCount < sizeOfFirstHalf; leftCount++){
            leftArray[leftCount] = givenArray[startIndex + leftCount];
        }

        for(int rightCount = 0; rightCount < sizeOfSecondHalf; rightCount++) {
            rightArray[rightCount] = givenArray[middleIndex + 1 + rightCount];
        }

        ///// Merging starts here /////

        //4. Initialize indices of the first and second arrays
        int leftCount =0; int rightCount = 0;


        //5. Initialize index of the merged sub array
        int mergedArrayIndex = startIndex;

        //6. Compare first and second array elements one by one
        // and then copy the lowest value into the merged array
        while( leftCount < sizeOfFirstHalf && rightCount < sizeOfSecondHalf){
            if(leftArray[leftCount] < rightArray[rightCount]){
                givenArray[mergedArrayIndex] = leftArray[leftCount];
                leftCount++;
            }else{
                givenArray[mergedArrayIndex] = rightArray[rightCount];
                rightCount++;
            }
            mergedArrayIndex++;
        }

        //7. Copy all the remaining elements from the left array
        // If the leftArrayIndex has not reached the end of left sub array.
        while ( leftCount < sizeOfFirstHalf){
            givenArray[mergedArrayIndex] = leftArray[leftCount];
            leftCount++;
            mergedArrayIndex++;
        }
        //8. Copy all the remaining elements from the right array
        // Only if the rightArrayIndex has not reached the end of right sub array.
        while( rightCount < sizeOfSecondHalf){
            givenArray[mergedArrayIndex] = rightArray[rightCount];
            rightCount++;
            mergedArrayIndex++;
        }
    }
}
