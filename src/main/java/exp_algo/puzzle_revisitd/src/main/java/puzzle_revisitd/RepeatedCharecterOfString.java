package puzzle_revisitd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedCharecterOfString {

	public static void main(String[] args) {
		String s = "jhinku nakur nakku nakur";
		/*
		 * for (Entry<Character, Integer> c : getDuplicateCharsOfString(s).entrySet()) {
		 * System.out.println(c); }
		 */
getDuplicateCharsOfString(s);
	}

	private static void getDuplicateCharsOfString(String s) {
		Map<Character, Integer> hm = new HashMap<>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}
		for (Entry<Character, Integer> mapElem : hm.entrySet()) {
			if (mapElem.getValue() > 1) {
				System.out.println(mapElem);
			}
		}
	}

}
