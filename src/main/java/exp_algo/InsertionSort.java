package exp_algo;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {

		int[] unsortedArr = { 20, 33, -11, 55, 22, 99, 99 };

		for (int UnsortedIndex = 1; UnsortedIndex < unsortedArr.length; UnsortedIndex++) {
			int temp = unsortedArr[UnsortedIndex];
			int i;
			for ( i = UnsortedIndex; i > 0 && unsortedArr[i - 1] > temp; i--) {

					unsortedArr[i] = unsortedArr[i - 1];
				
			}
			unsortedArr[i] = temp;
		}
		System.out.println("sorted array:::"+Arrays.toString(unsortedArr));
	}
}