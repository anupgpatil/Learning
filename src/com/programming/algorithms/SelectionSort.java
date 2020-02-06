package com.programming.algorithms;

public class SelectionSort {

    public static void main(String args[]){

        int[] intArray = { 6, 89 , 5 , -3 , 17 , 21 , -31};
        int[] intArray2 = { 6, 89 , 5 , -3 , 17 , 21 , -31};

        //Traversing the Array to identify the largest element in every run and moving to the last index
        //in other words trying to find the largest element to sit in position arrayLength-1(last index)
        for (int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largestElementIndex = 0; //assuming the 0 element is the largest index

            for(int i=1;i<=lastUnsortedIndex;i++){ // traversing till the the unsorted last index , will reduce with every upper loop
                if(intArray[i]>intArray[largestElementIndex]){
                    largestElementIndex=i; // changing the index after comparison
                }
            }
            compareAndSwap(intArray,lastUnsortedIndex,largestElementIndex);
        }
        System.out.println("Ascending =======>");
        for (int i = 0; i<intArray.length;i++) {
            System.out.println(intArray[i]);
        }
        System.out.println();

        for (int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int smallestElementIndex = lastUnsortedIndex;

            for(int i=0;i<=lastUnsortedIndex;i++){
                if(intArray2[i]<intArray2[smallestElementIndex]){
                    smallestElementIndex=i;
                }
            }
            compareAndSwap(intArray2,lastUnsortedIndex,smallestElementIndex);


        }
        System.out.println("Descending =======>");
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
