package puzzle_revisitd;

public class PalindromString {

	public static void main(String[] args) {
		String s = Integer.toString(1221);
		if (isPalindrom(s))
			System.out.println("the string is palindrom");
		else
			System.out.println("the string is not a palindrom string");
	}

	private static boolean isPalindrom(String input) {
		boolean palindrom = false;
		char[] ch = input.trim().toLowerCase().toCharArray();
		String s = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			s += ch[i];
		}
		System.out.println("s:::" + s);
		if (s.equalsIgnoreCase(input))
			palindrom = true;
		return palindrom;
	}

}
