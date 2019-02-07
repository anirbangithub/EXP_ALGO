package exp_algo;

import java.util.Arrays;

public class System_ArrayCopy {

	
	public static void main(String[] args) {
		int[] a = {22,33,44,11,1};
		int[] b = new int[a.length-1];
		 System.arraycopy(a, 1, b, 0, a.length-1);
		 
		 System.out.println("b::"+Arrays.toString(b));
	}
}
