package com.sorting;
// Time complexity: O(N Log N)
// Space complexity: O(N)
import java.util.Arrays;

class QS {
    void sort(int[] array, int low, int high) {
        if (low < high) {
            //Finding the first pivot point
            int pivot = partition(array, low, high);
            //Sorting both left and right sides of the
            //Array.
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, high);
        }
    }

    int partition(int[] array, int low, int high) {
        //Selecting the last value as the pivot.
        int pivot=array[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(array[j]<pivot){
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
}

public class QuickSort {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 6, 7, 2, 4, 8};
        int lastIndex, firstIndex;
        System.out.println("Unsorted: " + Arrays.toString(array));
        lastIndex = array.length - 1;
        firstIndex = 0;
        QS object = new QS();
        object.sort(array, firstIndex, lastIndex);
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}
