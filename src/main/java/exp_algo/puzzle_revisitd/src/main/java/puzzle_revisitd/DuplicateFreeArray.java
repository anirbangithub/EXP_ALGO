package puzzle_revisitd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class DuplicateFreeArray {
	public static void main(String[] args) {
		String[] ar = { "ok", "pp", "kk", "ok" };
		//System.out.println("duplicate free array" + String.valueOf(dupFreeArray(ar)));

for(String s :dupFreeArray(ar))
	System.out.println("array--"+s);
	}

	private static String[] dupFreeArray(String[] strAr) {

		List<String> finalAr = Arrays.asList(strAr);
		Arrays.sort(strAr);

		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.addAll(finalAr);
		String[] tempArr = new String[set.size()];
		int i = 0;
		for (String s : set) {
			tempArr[i++] = s;
		}
		return tempArr;
	}

}
