package com.programming.algorithms;

public class BubbleSort {

    public static void main(String args[]){

        int[] intArray = { 6, 89 , 5 , -3 , 17 , 21 , -31};
        int[] intArray2 = intArray;

        for(int unSortedIndex = intArray.length-1; unSortedIndex>0 ; unSortedIndex--){ //The Sorted Index moves right to left so with every loop we
            // will bubble the biggest element to the right
            for(int i=0;i<unSortedIndex;i++){ // traverses and compares each element from left to right
                if(intArray[i]>intArray[i+1]){
                    compareAndSwap(intArray,i , i+1);
                }
            }
        }
        System.out.println("Ascending========");
        for (int i = 0; i<intArray.length;i++) {
            System.out.println(intArray[i]);
        }

        for(int unSortedIndex = intArray2.length-1; unSortedIndex>0 ; unSortedIndex--){ // Sorted Index moves right to left,
            // with every loop the highest element moves to left
            for(int i=intArray2.length-1;i>0;i--){ // traverses the loop in reverse order so that the highest element moves right to left
                if(intArray2[i-1]<intArray2[i]){
                    compareAndSwap(intArray2,i-1,i); // changing the order of elements to be swapped.
                }
            }
        }
        System.out.println("Descending========");
        for (int i = 0; i<intArray2.length;i++) {
            System.out.println(intArray2[i]);
        }

    }

    /*
    * Method to Compare the values and Swap the Values in array*/
    private static void compareAndSwap(int[] array, int i, int j){
        if(i==j){
            return ;
        }

        int temp = array[i]; // In-Place Algorithm Variable
        array[i] = array[j];
        array[j] = temp;
    }
}
