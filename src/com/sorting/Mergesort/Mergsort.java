package com.learn;

import java.util.Arrays;


class MS{

    void merge(int[] array, int firstIndex, int middleIndex, int lastIndex){
        // Last index in left side sub arrays =Lils
        int Lils=middleIndex-firstIndex+1;
        // Last index in right side sub arrays =Lirs
        int Lirs=lastIndex-middleIndex;

        // creating temporary left and right arrays to
        // store the values
        // with the size of the elements in it.
        int[] Left=new int[Lils];
        int[] Right=new int[Lirs];

        // Assigning elements
        for(int i=0;i<Lils;i++){
            // Assigning elements from the first wing(left)
            // to its corresponding Left[] array
            Left[i]=array[firstIndex+i];
        }
        for(int j=0;j<Lirs;j++){
            // Assigning elements from the second wing(right)
            // to its corresponding Right[] array
            Right[j]=array[middleIndex+j+1];
        }
        // getting index to its its initial states
        int i=0,j=0;

        // actual sorting section
        // checking the elements and changing there positions
        // swapping
        int k=firstIndex;
        while(i< Lils && j<Lirs){
            if(Left[i]<=Right[j]){
                array[k]=Left[i];
                i++;
            }
            else{
                array[k]=Right[j];
                j++;
            }
            k++;
        }
        while(i<Lils){
            array[k]=Left[i];
            i++;
            k++;
        }
        while(j<Lirs){
            array[k]=Right[j];
            j++;
            k++;
        }
    }

    void sort(int[] array, int firstIndex, int lastIndex){
        //Order check
        if(firstIndex<lastIndex){
            // find the middle point
            int middleIndex=(firstIndex+lastIndex)/2;
            // Left side
            // calling the sort function again to dived the array in half
            // again and find its middle index
            sort(array,firstIndex,middleIndex);
            // Right side
            // calling the sort function again to dived the array in half
            // again and find its middle index
            sort(array,middleIndex+1,lastIndex);
            // merge the arrays to gather
            merge(array,firstIndex,middleIndex,lastIndex);

        }
    }
}
public class Mergsort {
    public static void main(String[] args){
        int[] array ={1,3,5,6,7,2,4,8};
        System.out.println(Arrays.toString(array));
        MS obj=new MS();
        obj.sort(array,0,7);
        System.out.println("sorted: "+Arrays.toString(array));

    }

}
