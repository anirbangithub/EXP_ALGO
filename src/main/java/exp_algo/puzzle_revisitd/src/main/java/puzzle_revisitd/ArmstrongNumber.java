package puzzle_revisitd;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
	public static void main(String[] args) {
		if (isArmstrong(153))
			System.out.println("this is  a armstrong no.");
		else
			System.out.println("this is not a armstrong no.");
	}

	private static boolean isArmstrong(int inputNo) {
		boolean armstrong = false;
		List<Integer> digits = new ArrayList<>();
		int a;
		int no = inputNo;
		int b = 0;
		while (no > 0) {
			digits.add(no);
			a = no % 10;
			b = b + (a * a * a);
			no = no / 10;

		}
		System.out.println(b);
		if (b == inputNo)
			armstrong = true;
		
		return armstrong;

	}
}
