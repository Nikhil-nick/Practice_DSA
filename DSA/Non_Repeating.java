/*
 "Given a string,
    return the first non-repeating character.

Examples:
String str1 = ""12345""
    //Return 1

String str2 = ""abbacd""
    //Return c"
*/
package GS.DSA.DSA;

import java.util.*;
import java.util.Map.Entry;

public class Non_Repeating {

	public static char firstNonRepeatingChar(String str) {
		Map<Character, Integer> countMap = new LinkedHashMap<>();

		// Count frequencies
		for (char ch : str.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		}

		// Find first character with count 1
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		// If no non-repeating character found
		return '\0';  // Null character indicates no result
	}

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingChar("12345"));   // Output: 1
		System.out.println(firstNonRepeatingChar("abbacd"));  // Output: c
	}
}