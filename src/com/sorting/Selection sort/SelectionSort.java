package com.learn;

import java.util.Arrays;

class SS{
    void sort(int[] array){
        int len=array.length;
        // Irritating through all index
        for(int i=0;i<len-1;i++){
            // Assigning min index
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                // Order check
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            //swapping the values
            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
    }
}
public class SelectionSort{
    public static void main(String[] args){
        int[] array={1,3,5,7,2,4,6,8};
        System.out.println("Unsorted array: "+ Arrays.toString(array));
        SS object=new SS();
        object.sort(array);
        System.out.println("Sorted array: "+Arrays.toString(array));
    }
}