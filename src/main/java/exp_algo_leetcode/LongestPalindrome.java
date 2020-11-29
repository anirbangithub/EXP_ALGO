package exp_algo_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import jdk.internal.joptsimple.internal.Strings;

public class LongestPalindrome {

	public static void main(String[] args) {

		System.out.println("return--" + longestPossiblePalindrom("ccc"));
	}

	public static int longestPalindrome(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int palindromLength = 0;
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);

		}
		for (int count : map.values()) {

			palindromLength += count;

			if (map.values().size() > palindromLength)
				palindromLength += 1;
		}
		return palindromLength;

	}

	public static int longestPalindrome2(String s) {
		int longest = 0;
		char[] charAr = s.toCharArray();
		if (s.length() <= 1)
			return s.length();

		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(charAr[i], i + 1) > -1) {
				String s1 = s.substring(i, s.indexOf(charAr[i], i + 1) + 1);
				StringBuilder s2 = new StringBuilder(s1);
				if (s2.reverse().equals(s2) && s2.length() > 0)
					longest = s2.length();

			}
		}
		return longest;
	}

	public static String longestPossiblePalindrom(String s) {
		
		String result = "";
		if (s.length() > 0) {
			result = s.substring(0, 1);
		}

		char[] charAr = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int firstIndex = s.indexOf(charAr[i],i);
			String sl = s.substring(firstIndex, s.lastIndexOf(charAr[i])+1);
			StringBuffer sbl = new StringBuffer(sl);
			if (sl.equals(sbl.reverse().toString()) && sl.length() > result.length()) {
				result = sl;
				
			}
			else {
			
			int currentIndex = s.indexOf(charAr[i], i + 1);
			while (s.indexOf(charAr[i], currentIndex) > -1 && currentIndex > -1) {
				String s1 = s.substring(firstIndex, currentIndex + 1);
				StringBuffer sb = new StringBuffer(s1);
				if (s1.equals(sb.reverse().toString()) && s1.length() > result.length()) {
					result = s1;
				}
				currentIndex = s.indexOf(charAr[i], currentIndex + 1);
			}
			}
		}

		return result;
	}

}
