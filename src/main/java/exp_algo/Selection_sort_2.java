package exp_algo;

import java.util.Arrays;

public class Selection_sort_2 {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 4, 3, -55, 22, 11 };
		System.out.println("unsorted array--" + Arrays.toString(ar));
		for(int lastUnsortedIndex = ar.length-1; lastUnsortedIndex>0;lastUnsortedIndex--)
		{
			int largestNo =0;
			for(int i=0;i<=lastUnsortedIndex;i++) {
				if(ar[i]>ar[largestNo])
					largestNo = i;
					
			}
			Utilityclass.swap(ar, largestNo, lastUnsortedIndex);
		}
		System.out.println("unsorted array--" + Arrays.toString(ar));
	}

}
