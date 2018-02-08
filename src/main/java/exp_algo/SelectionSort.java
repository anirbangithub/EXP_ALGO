package exp_algo;

/**
 * @author anirban
 * 
 * 
 *arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
11 12 22 25 64 
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] unsortedArray = { 64, 25, 12, 22, 11};
		for (int i : unsortedArray) {
			System.out.println("unsorted array---" + i);
		}
		int[] sortedArray = doSelectionSort(unsortedArray);
		for (int j : sortedArray) {
			System.out.println("sortedArray---" + j);
		}

	}

	// step i--- run 2 for loop one from 0 second from i+1,(second loop will only check if the jth element is greater than ith element)
	// step ii --- wherever u find the variable smaller than the current swap
	// with the current location
	// step iii --- keep On shifting the minimum valuation to zeroth position
	public static int[] doSelectionSort(int[] unsortedArray) {
		int[] sortedArray = null;
		for (int i = 0; i < unsortedArray.length-1; i++) {
			int min_index = i;
			for (int j = i + 1; j < unsortedArray.length; j++) 
				if (unsortedArray[j] < unsortedArray[min_index]) 
					min_index = j;
					int smallerNo = unsortedArray[min_index];	
					unsortedArray[min_index] = unsortedArray[i];
					unsortedArray[i] = smallerNo;
		}
		
		sortedArray =unsortedArray;
		return sortedArray;
	}
}
