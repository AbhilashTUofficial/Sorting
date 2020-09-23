package com.learn;

import java.util.Arrays;

class IS{
    void sort(int[] array){
    // finding the length of the array
    int len=array.length;
    // irritating through all positions in the array
    for(int i=0;i<len;i++){
        // initializing the key value
        int key=array[i];
        // initializing the pointer value
        int j=i-1;
        // check conditions
        while(j>=0 && key<array[j]){
            // Swapping elements
            array[j+1]=array[j];
            j=j-1;
        }
        // Assigning new key
        array[j+1]=key;
    }
    }
}
public class InsertionSort {
    public static void main(String[] args){
        int[] array={1,3,5,7,2,4,6,8};
        System.out.println("Unsorted array: "+ Arrays.toString(array));
        IS object=new IS();
        // passing array
        object.sort(array);
        System.out.println("Sorted array: "+Arrays.toString(array));
    }

}


