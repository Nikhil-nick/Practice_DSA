//"Given a sentence/phrase and two words,
//    return the minimum distance between the words.
//
//Example:
//    String str = “the quick the brown quick brown the frog”
//    String word1 = “quick”
//    String word2 = ""frog""
//
//    //Return 2"

package GS.DSA.DSA;

import java.util.*;

public class Min_dist_words {

	public static void main(String[] args) {
		String s = "the quick the brown quick brown the frog";
		String a[] = s.split("\\s+");
		System.out.println(Arrays.toString(a));
		int f = -1, q = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("frog")) {
				f = i;
			}
			if (a[i].equals("quick")) {
				q = i;
			}
			
			if(f!=-1 && q!=-1) {
				int d=Math.abs(f-q)-1;
				min=Math.min(min, d);
			}
		}
		System.out.println(min);
	}
}