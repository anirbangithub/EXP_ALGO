package exp_algo;

public class BubbleSort {

	public static void main(String[] args) {
		int[] unsortedArray = {2,3,4,9,33,111,44,12};
		for(int i:unsortedArray)
		System.out.println("unsorted array--"+i);
		int [] sortedArray = doBubbleSort(unsortedArray);
		for(int j : sortedArray)
			System.out.println("sorted array---"+j);
	}

	public static int[] doBubbleSort(int [] unsortedArray){
		int[] SortedArray = null;
		for(int i = 0 ;i<unsortedArray.length-1;i++){
			for (int j =i+1;j<unsortedArray.length;j++)
				if(unsortedArray[i]> unsortedArray[j]){
					int bigNo = unsortedArray[i];
					unsortedArray[i] = unsortedArray[j];
					unsortedArray[j] = bigNo;
				}
		}
		SortedArray= unsortedArray;
		return SortedArray ;
	}
	
}
