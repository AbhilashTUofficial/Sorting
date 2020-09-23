package com.learn;

import java.util.Arrays;

class BS {

    int[] swap(int[] array,int length) {
        // creating temporary array to swift the values
        int[] temp = new int[length];
        // irritating through all positions
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                //Order check
                if (array[i] < array[j]) {
                    // swapping value to a temporary array
                    // and swap it back
                    temp[i] = array[i];
                    array[i] = array[j];
                    array[j] = temp[i];

                }
            }
        }
        return array;
    }
}

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 6, 7, 2, 4, 8};
        System.out.println("Unsorted: "+Arrays.toString(array));
        int length=array.length;
        BS object = new BS();
        object.swap(array,length);
        System.out.println("Sorted: "+Arrays.toString(array));

    }
}
