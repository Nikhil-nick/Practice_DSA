//"Convert a string as given in the format below:
//
//Example:
//aabbb into a2b3
//aaaa into a4
//a into a1"


package GS.DSA.DSA;

public class RLE {
	public static void main(String[] args) {
		String s = "aabbbccddd";
		String ans = "";
		int n=s.length();
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				ans = ans + s.charAt(i) + count;
				count = 1;
			}
		}
		ans=ans+s.charAt(n-1)+count;
		System.out.println(ans);
	}
}
