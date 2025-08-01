/*
 "Given a string,
    return the starting index & length of the longest substring containing the same character.

Example:
    String[] str = ""aabbbbCCddd"";    // Return 2 (index) and substring ""bbbb"""
*/
package GS.DSA.DSA;

public class Longest_substring {
	public static void main(String[] args) {
		String s = "aabbbbbccdddd";
		int maxCount = 1;
        char maxChar = s.charAt(0);
		int n=s.length();
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				if (count > maxCount) {
                    maxCount = count;
                    maxChar = s.charAt(i);
                }
				
				count = 1;
			}
		}
		
		
		if (count > maxCount) {
            maxCount = count;
            maxChar = s.charAt(s.length() - 1);
        }

        // Print the longest sequence
        for (int i = 0; i < maxCount; i++) {
            System.out.print(maxChar);
        }
	}
}
