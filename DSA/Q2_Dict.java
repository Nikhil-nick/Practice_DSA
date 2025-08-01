/*
 "Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.

Example:
String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"", ""dodge"", ""mODJ"", ""LODGESSSS""}
String toSearch = ""ODG"";

Returns 9 (LODGESSSS)"
*/
package GS.DSA.DSA;
public class Q2_Dict {
	public static void main(String[] args) {

		String[] s = { "CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODKGESSSS" };
		String s1 = "ODG";
		int max = 0; String ans="";
		for (int i = 0; i < s.length; i++) {
			if (s[i].contains(s1)) {
				if(s[i].length()>max) {
					ans=s[i];
					max=s[i].length();
				}
			}
		}
		System.out.println(ans);
	}
}
