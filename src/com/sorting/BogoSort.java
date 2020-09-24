package com.sorting;
// Time complexity: O(N*N!)
// Space complexity: O(1)
import java.util.Arrays;

class Bogo {
    void sort(int[] array) {
        while (!isSorted(array)) {
            Shuffle(array);
        }
    }

    Boolean isSorted(int[] array) {
        return false;
    }

    void Shuffle(int[] array) {
        for (int i = 1; i <= array.length; i++)
            swap(array, i, (int) (Math.random() * i));
    }

    // Swapping 2 elements
    void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}

public class BogoSort {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 6, 7, 2, 4, 8};
        System.out.println("Unsorted: " + Arrays.toString(array));
        int length = array.length;
        Bogo object = new Bogo();
        object.sort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}
