//"Given a string,
//		return the first non-repeating character.
//
//		Examples:
//		String str1 = ""12345""
//		//Return 1
//
//		String str2 = ""abbacd""
//		//Return c"

package GS.DSA.DSA;

import java.util.*;

public class Non_repeating {
	public static void main(String[] args) {
		String s = "123451";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

		for (Character i : map.keySet()) {

			if(map.get(i)==1) {
				System.out.println(i);
				return;
			}
		}
	}
}