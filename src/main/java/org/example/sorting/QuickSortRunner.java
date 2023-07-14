package org.example.sorting;

public class QuickSortRunner {

    /**
     * [23,34,56,11,20,12,17,48,37,14]
     *
     * */
    public static void main(String[] args) {
        int givenArray[] = {23,34,56,11,20,12,17,48,37,14};
        int sizeOfArray = givenArray.length;
        int sortedArray[] = quicksort(givenArray, 0, sizeOfArray-1);
        System.out.println("");
    }

    private static void swap(int[] givenArray, int indexOfFirstValue, int indexOfSecondValue) {
        if(indexOfFirstValue != indexOfSecondValue) {
            int tempValue = givenArray[indexOfFirstValue];
            givenArray[indexOfFirstValue] = givenArray[indexOfSecondValue];
            givenArray[indexOfSecondValue] = tempValue;
        }
    }

    private static int partition(int[] givenArray, int leftIndex, int rightIndex) {

        // 1. Choosing the pivot
        int pivotElement = givenArray[rightIndex];
        int leftMarker = leftIndex;

        for(int leftPointer = leftIndex; leftPointer < rightIndex; leftPointer++){

            if(givenArray[leftPointer] < pivotElement) {
                swap(givenArray, leftMarker, leftPointer);
                leftMarker++;

                //Reset the leftPointer
                leftPointer = leftMarker-1;
            }
        }
        swap(givenArray, leftMarker, rightIndex);


        return leftMarker;
    }


    private static int[] quicksort(int[] givenArray, int leftIndex, int rightIndex) {
        // The last element is going to be pivot.
        if(leftIndex < rightIndex) {
            //Partition - We identify the pivot and place the pivot in the center
            // such that all the elements to the left of the pivot are lesser than the pivot element
            // and all the elements to the right of the pivot are greater than the pivot element.
            int paritionIndex = partition(givenArray, leftIndex, rightIndex);

            //sort the left side of pivot.
            quicksort(givenArray, leftIndex, paritionIndex-1);

            //sort the right side of pivot.
            quicksort(givenArray, paritionIndex+1, rightIndex);

        }
        return givenArray;
    }

}
