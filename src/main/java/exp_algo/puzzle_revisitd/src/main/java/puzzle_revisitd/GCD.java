package puzzle_revisitd;

/**
 * @author anirban
 *
 */
public class GCD {
	
	public static void main(String[] args) {
	int no1 = 16;
	int no2 = 24;
		int gcd = getGCD(no1, no2);
		System.out.println("gcd of "+no1+ " & "+ no2 +"is:::"+gcd);
	}
	/**
	 * logic ::: 
	 * 1. divide no1 by no2 
	 * 2. call the same function again with arguement as-- no1 == no2, no2 == no1%no2(remainder of  2 no.)
	 * 3. repeat the circle till u get remainder as 0 (we are checking in the beginning of the function)
	 */
	private static int getGCD(int no1, int no2) {
		if(no2==0) {
			return no1;
		}
		else
			return getGCD(no2, no1%no2);
		 
	}

	
}
