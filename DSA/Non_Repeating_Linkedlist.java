//"Given a string,
//    return the first non-repeating character.
//
//Examples:
//String str1 = ""12345""
//    //Return 1
//
//String str2 = ""abbacd""
//    //Return c"

package GS.DSA.DSA;

import java.util.*;
import java.util.Map.Entry;

public class Non_Repeating_Linkedlist {

	public static void main(String[] args) {
		String s = "aakpbcdc";
		boolean flag = false;
		Map<Character, Integer> map = new LinkedHashMap();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
//				int val = map.get(c);
//				map.put(c, val + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		for (Entry<Character, Integer> mp : map.entrySet()) {
			if (mp.getValue() == 1) {
				System.out.println(mp.getKey());
				flag = true;
				return;
			}
		}
		if (flag == false) {
			System.out.println("null");
		}
	}
}