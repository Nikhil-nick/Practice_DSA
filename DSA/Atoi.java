//"Implement your custom atoi function in Java.
//    Given a string, you have to convert into integer. The input string may contain alphabets and special characters alongside numbers (both negative and positive).
//
//Examples:
//    String str1 = ""123"";     //Return 123 (in integer format)
//
//    String str2 = ""-123"";    //Return -123
//
//    String str3 = ""1a23"";   //Return -1 (Invalid entry)"

package GS.DSA.DSA;
public class Atoi {

	public static void main(String[] args) {
		String s = "123";
		int sign = 1;
		int num = 0;
		int j = 0;
		if (s.charAt(j) == '-' || s.charAt(j) == '+') {
			sign = s.charAt(0) == '-' ? -1 : 1;
			j++;
		}
		for (int i = j; i < s.length(); i++) {
			int c = s.charAt(i);
			if (!Character.isDigit(c)) {
				System.out.println("-1");
				return;
			}
			num = num * 10 + c - '0';
		}
		System.out.println(num*sign);
	}
}