package puzzle_revisitd;

import java.util.ArrayList;
import java.util.List;

public class LCMMultipleNumbers {
	public static void main(String[] args) {
		List<Integer> inputList = new ArrayList<>();
		inputList.add(24);
		inputList.add(48);
		inputList.add(32);
		inputList.add(240);
		int gcd = getLCMMultiple(inputList);
		System.out.println("lcm is::" + gcd);
	}
	private static int getLCMMultiple(List<Integer> inputList) {
		int lcm = 0;
		int m = 1;
		lcm = getLCM(inputList.get(0), inputList.get(1));
		if (inputList.size() >= 2)
			for (int i = 0; i < inputList.size(); i++) {
				lcm = getLCM(lcm, inputList.get(i));
			}
		return lcm;
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
		if (no2 == 0)
			return no1;
		else
			return (getGCD(no2, (no1 % no2)));
	}
}
