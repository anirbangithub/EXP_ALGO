package exp_algo;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		int[] babluInput = { 2115, 8228, 1841, 4244, 5115, 2613, 8236, 9129 };

		System.out.println("before sorting::" + Arrays.toString(babluInput));
		radixSortAll(babluInput, 4, 10);
		System.out.println("after sorting::" + Arrays.toString(babluInput));
	}

	public static void radixSortAll(int[] input, int width, int radix) {
		for (int i = 0; i < input.length; i++) {
			radixSingleSort(input, i, radix);
		}
	}

	public static void radixSingleSort(int[] input, int position, int radix) {
		int[] countArray = new int[radix];
		for (int value : input)
			countArray[getDigit(position, value, radix)]++;
		for (int i = 1; i < radix; i++)
			countArray[i] += countArray[i -1];
		int[] tempArray = new int[input.length];
		for (int tempIndex = input.length - 1; tempIndex >= 0; tempIndex--)
			tempArray[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
		/*for (int tempIndex = 0; tempIndex < input.length; tempIndex++) {
			input[tempIndex] = tempArray[tempIndex];
		}*/
		System.arraycopy(tempArray, 0, input, 0, tempArray.length);
	}

	public static int getDigit(int position, int value, int radix) {
		return (value / (int) Math.pow(radix, position)) % radix;
	}

}
