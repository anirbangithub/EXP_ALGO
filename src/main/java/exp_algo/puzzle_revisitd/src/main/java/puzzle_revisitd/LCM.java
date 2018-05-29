package puzzle_revisitd;

/**
 * @author anirban
 *
 */
public class LCM {

	public static void main(String[] args) {
		int no1 = 4;
		int no2 = 24;
		int lcm = getLCM(no1, no2);
		System.out.println("LCM of "+no1 +"& " +no2+ "is:::"+lcm);
	}

	/**
	 * @param no1
	 * @param no2
	 * @logic 
	 * LCM * GCM = no1*no2;
	 * so we will get the GCM of both number as it is easy
	 * we will get the multiplication of both no. 
	 * & we will divide the multiplication with the GCM
	 */
	private static int getLCM(int no1, int no2) {
		int gcd = getGCD(no1, no2);
		return (no1 * no2 / gcd);
	}

	private static int getGCD(int no1, int no2) {

		if (no2 == 0) {
			return no1;
		} else
			return getGCD(no2, no1 % no2);

	}
}
