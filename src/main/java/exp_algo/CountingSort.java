package exp_algo;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 3, 5, 7, 9, 8 };
		countSort(input, 1, 9);
		System.out.println("sorted-"+Arrays.toString(input));
	}

	public static void countSort(int[] input,int min,int max) {
		int[] temp = new int[(max - min) + 1];
		for (int i = 0; i < input.length; i++) {
			int val = input[i];
			temp[val-min]++;
		}
		int j=0;
		for(int i =min;i<=max;i++) {
			while(temp[i-min]>0) {
				input[j++] =i;
				temp[i-min]--;
			}
		}
		
	}
	

}
