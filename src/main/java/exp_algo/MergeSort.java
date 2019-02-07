package exp_algo;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] ar = { 89, 22, 1, 33, 5, 667, 7, 88 };
		mergeSort(ar, 0, ar.length);
		System.out.println("sorted array"+Arrays.toString(ar));
	}

	public static void mergeSort(int[] input, int start, int end) {
		if (end - start < 2)
			return;

		int mid = (end + start) / 2;
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);
	}

	private static void merge(int[] input, int start, int mid, int end) {
		int tempIndex = 0;
		int i = start;
		int j = mid;
		int[] temp = new int[end - start];
		if (input[mid - 1] <= input[mid]) {
			return;
		}
		while (i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		
		  System.arraycopy(input, i, input, start+tempIndex, mid-i); 
		  System.arraycopy(input, 0, input, start, tempIndex);
		 
		/*System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);*/
	}
}
