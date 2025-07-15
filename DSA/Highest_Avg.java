//"Given a list of student names and corresponding marks,
//    return the highest average marks (and print the corresponding student name - optional).
//    The marks can be negative as well and a student may have multiple marks.
//
//Example:
// String[][] = {{“Charles”, 84},
//                      {“John”, 100},
//                      {“Andy”, 37},
//                      {“John”, 23},
//                      {“Charles”, 20}};
//
//    //Return 61.5 (which is of John's)"

package GS.DSA.DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Highest_Avg {

	public static int highAverage(String[][] records) {
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (String[] s : records) {
			String s1 = s[0];
			if (map.containsKey(s1)) {
				List<Integer> val = map.get(s1);
				val.set(0, val.get(0) + 1);
				val.set(1, val.get(1) + Integer.valueOf(s[1]));
				map.put(s1, val);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(1);
				list.add(Integer.valueOf(s[1]));
				map.put(s1, list);
			}

		}
		double ans = Double.NEGATIVE_INFINITY;
		for (Entry<String, List<Integer>> mm : map.entrySet()) {

			List<Integer> list = mm.getValue();

			double an = (double) list.get(1) / list.get(0);
			ans = Math.max(an, ans);
		}
		System.out.println(map);
		System.out.println(ans);
		return 0;
	}

	public static void main(String[] args) {
		String[][] records = { { "Charles", "84" }, { "John", "100" }, { "Andy", "37" }, { "John", "23" },
				{ "Charles", "20" } };

		double result = highAverage(records);
		System.out.println("Highest average marks: " + result);
	}
}
