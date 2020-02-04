package com.programming.algorithms;

public class BubbleSort {

    public static void main(String args[]){

        int[] intArray = { 6, 89 , 5 , -3 , 17 , 21 , -31};

        for(int unSortedIndex = intArray.length-1; unSortedIndex>0 ; unSortedIndex--){ //The Sorted Index moves right to left so with every loop we
            // will bubble the biggest element to the right
            for(int i=0;i<unSortedIndex;i++){ // traverses and compares each element from left to right
                if(intArray[i]>intArray[i+1]){
                    compareAndSwap(intArray,i , i+1);
                }
            }
        }
        for (int i = 0; i<intArray.length;i++) {
            System.out.println(intArray[i]);
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
