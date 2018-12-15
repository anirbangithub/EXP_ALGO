package exp_algo;

public class Utilityclass {
	public static void swap(int[] ar, int i, int j) {
		if (i == j)
			return;
		else {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
	}
}
