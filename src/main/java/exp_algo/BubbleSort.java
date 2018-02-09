package exp_algo;

/**
 * @author anirban
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] unsortedArray = {2,3,4,9,33,111,666,44,12};
		for(int i:unsortedArray)
		System.out.println("unsorted array--"+i);
		int [] sortedArray = doBubbleSort(unsortedArray);
		for(int j : sortedArray)
			System.out.println("sorted array---"+j);
	}

	/**
	 * @param unsortedArray
	 * @return sorted array
	 * this sorting algo works on the principal of swapping 
	 * 
	 */
	public static int[] doBubbleSort(int [] unsortedArray){
		int[] SortedArray = null;
		for(int i = 0 ;i<unsortedArray.length-1;i++){
			for (int j =i+1;j<unsortedArray.length-i-1;j++)
				if(unsortedArray[j]> unsortedArray[j+1]){
					int bigNo = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j+1];
					unsortedArray[j+1] = bigNo;
				}
		}
		SortedArray= unsortedArray;
		return SortedArray ;
	}
	
}
