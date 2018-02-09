package exp_algo;

import java.util.Arrays;

public class recursiveBubbleSort {

	public static void main(String[] args) {
		int[] unsortedArray = { 22, 11, 12, 44, 66, 2, 3, 66 };
			System.out.println("unsorted Array--" +Arrays.toString(unsortedArray));
		doRecursiveSort(unsortedArray,unsortedArray.length);		
			System.out.println("sorted array--" + Arrays.toString(unsortedArray));
	}

	 static void doRecursiveSort(int arr[], int n)
	    {
	        // Base case
	        if (n == 1)
	            return;
	      
	        // One pass of bubble sort. After
	        // this pass, the largest element
	        // is moved (or bubbled) to end.
	        for (int i=0; i<n-1; i++)
	            if (arr[i] > arr[i+1])
	            {
	            	// swap arr[i], arr[i+1]
	                int temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	            }
	      
	        // Largest element is fixed,
	        // recur for remaining array
	        doRecursiveSort(arr, n-1);
	    }
}
