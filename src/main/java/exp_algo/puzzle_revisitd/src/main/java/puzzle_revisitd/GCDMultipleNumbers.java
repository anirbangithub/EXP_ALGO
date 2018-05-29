package puzzle_revisitd;

import java.util.ArrayList;
import java.util.List;

public class GCDMultipleNumbers {
	public static void main(String[] args) {
		List<Integer> inputList = new ArrayList<>();
		inputList.add(24);
		inputList.add(48);
		inputList.add(32);
		inputList.add(240);
		int gcd = getGCDMultiple(inputList);
		System.out.println("gcd is::" + gcd);
	}

	private static int getGCDMultiple(List<Integer> inputList) {
		int gcd = 1;
		gcd = getGCD(inputList.get(0), inputList.get(1));
		if (inputList.size() >= 2)
			for (int i = 2; i < inputList.size(); i++) {
				gcd = getGCD(gcd, inputList.get(i));

			}
		return gcd;
	}

	private static int getGCD(int no1, int no2) {
		if (no2 == 0)
			return no1;
		else
			return (getGCD(no2, (no1 % no2)));
	}
}
