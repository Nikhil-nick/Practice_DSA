//"Given a string,
//    return the pallindrome of maximum length and its length.
//    (So, you return both the relevant pallindrome substring and its length).
//
//Example:
//    String str = ""forgeeksskeegfor"";    // Return {""geeksskeeg"",  10}"

package GS.DSA.DSA;

public class longest_palindrome {
	public static String solve(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); ++i) {
            dp[i][i] = true;
            for (int j = 0; j < i; ++j) {
                if (s.charAt(j) == s.charAt(i) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }

public static void main(String[] args) {
    String str = "forgeeksskeegfor";
    System.out.println(solve(str));
}
}
