package exp_algo;

import java.util.Arrays;

public class Bubble_sort_2 {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 4, 3, -55, 22, 11 };
		System.out.println("unsorted array--" + Arrays.toString(ar));
		// last unsorted index is i
		for (int i = ar.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				
				if (ar[j] > ar[j + 1])
					swap(ar, j, j + 1);
			}
		}
		System.out.println("sorted array--" + Arrays.toString(ar));
	}

	private static void swap(int[] ar, int i, int j) {
		if (i == j)
			return;
		else {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
	}
}
