package com.programming.algorithms;

public class InsertionSort {

    public static void main (String args[]){

        int[] intArray = { 6, 89 , 5 , -3 , 17 , 21 , -31};
        int[] intArray2 = { 6, 89 , 5 , -3 , 17 , 21 , -31};

        System.out.println("=======Ascending=========");
        for (int unSortedIndex =1; unSortedIndex<intArray.length;unSortedIndex++){ // Assuming the first element onleft is the sorted Partition,
            // start comparison from second element and till the last elment mving to right

            int comparingElement = intArray[unSortedIndex]; // with every iteration the comparablelement movestoright by one element
            int i; // keeping this since requiredforthe final insert
            for(i=unSortedIndex ; i>0 && intArray[i-1]>comparingElement ;i--){ // loop the sorted partition in reverse order right to left
                // starting from the second element to first element and so on
                intArray[i] = intArray[i-1]; //swapping elements
            }
            intArray[i]=comparingElement;
        }

        for (int i = 0; i<intArray.length;i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("=======Descending=========");
        for(int unSortedIndex = intArray2.length-2;unSortedIndex>=0;unSortedIndex--){

            int comparableElement = intArray2[unSortedIndex];

            int i;

            for(i = unSortedIndex; i<intArray2.length && intArray2[i+1]>comparableElement;i++){
                intArray2[i] = intArray2[i+1];
            }
            intArray2[i] = comparableElement;
        }

        for (int i = 0; i<intArray.length;i++) {
            System.out.println(intArray2[i]);
        }

    }
}
