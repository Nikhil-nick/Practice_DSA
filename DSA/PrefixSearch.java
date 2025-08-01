/*
 "Prefix Search
    Given a document and a prefix, return all the words starting with the prefix.

Example:
Say the document is a string of words,
    String[] arr = {""apple"", ""applet"", ""bread"", ""aper""};
    String prefix = ""app"";

    // Return apple, applet"
*/
package GS.DSA.DSA;

import java.util.*;

public class PrefixSearch {

	public static List<String> getWordsStartingWithPrefix(String[] arr, String prefix) {
		List<String> result = new ArrayList<>();

		for (String word : arr) {
			if (word.startsWith(prefix)) {
				result.add(word);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String[] arr = {"apple", "applet", "bread", "aper"};
		String prefix = "app";

		List<String> matchedWords = getWordsStartingWithPrefix(arr, prefix);

		System.out.println(matchedWords); // Output: [apple, applet]
	}
}
