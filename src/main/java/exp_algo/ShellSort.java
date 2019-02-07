package exp_algo;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = { 3, 9, 22, 55, -11 };
		// int gap = arr.length / 2;
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// int temp = arr[gap];

			for (int j = gap; j < arr.length; j++) {
				int i;
				int temp = arr[j];
				for (i = j;i>=gap && arr[i-gap] > temp; i-=gap) {
					arr[i] = arr[i - gap];
				}
				arr[i] = temp;
			}

		}
		System.out.println("sorted array---" + Arrays.toString(arr));
	}

}
