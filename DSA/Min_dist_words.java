/*
 "Given a sentence/phrase and two words,
    return the minimum distance between the words.

Example:
    String str = “the quick the brown quick brown the frog”
    String word1 = “quick”
    String word2 = ""frog""

    //Return 2"
*/
package GS.DSA.DSA;

import java.util.*;

public class Min_dist_words {

	public static int minDistance(String str, String word1, String word2) {
		String[] words = str.split("\\s+");
		int minDistance = Integer.MAX_VALUE;
		int lastPos1 = -1, lastPos2 = -1;

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				lastPos1 = i;
			} else if (words[i].equals(word2)) {
				lastPos2 = i;
			}

			if (lastPos1 != -1 && lastPos2 != -1) {
				int distance = Math.abs(lastPos1 - lastPos2)-1;
				minDistance = Math.min(minDistance, distance);
			}
		}

		return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
	}

	public static void main(String[] args) {
		String str = "the quick the brown quick brown the frog";
		String word1 = "quick";
		String word2 = "frog";

		System.out.println(minDistance(str, word1, word2));  // Output: 2
	}
}