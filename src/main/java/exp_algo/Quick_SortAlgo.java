package exp_algo;

import java.util.Arrays;

public class Quick_SortAlgo {
     
   // private int array[];
   // private int length;
 
    /*public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }*/
 
    private void quickSort(int[] array,int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivotIndex = lowerIndex+(higherIndex-lowerIndex)/2;
        int pivot = array[pivotIndex];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) 
                i++;
            
            while (array[j] > pivot) 
                j--;
            
            if (i <= j) {
                exchangeNumbers(array,i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(array,lowerIndex, j);
        if (i < higherIndex)
            quickSort(array,i, higherIndex);
    }
 
    private void exchangeNumbers(int[] array,int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        Quick_SortAlgo sorter = new Quick_SortAlgo();
        int[] input = {-24,2,45,20,56,75,2,56,99,53,12};
        sorter.quickSort(input,0, input.length-1);
       // sorter.sort(input);
     System.out.println( Arrays.toString(input));
    }
}