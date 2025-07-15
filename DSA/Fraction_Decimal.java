//"Given two integers representing the numerator and denominator of a fraction,
//    return the fraction in string format.
//    [If the fractional part is repeating, enclose the repeating part in parentheses].
//
//Examples:
//    Numerator = 1, Denominator = 2
//    // Return ""0.5""
//
//    Numerator = 1, Denominator = -2
//    // Return ""-0.5""
//
//    Numerator = 50, Denominator = 22
//    // Return ""2.(27)""  [Fractional part (27) is repeating, hence enclosed in paranthesis]"

package GS.DSA.DSA;
import java.util.HashMap;
import java.util.Map;

public class Fraction_Decimal {
	public static void main(String[] args) {
		String aa = rem();
		System.out.println(aa);
	}
	private static String rem() {
		int n = 50, d = 10;
		StringBuilder ans = new StringBuilder();
		int div = n / d;
		if (n % d == 0)
			return ans + "" + div;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		ans.append(div); 
		ans.append(".");
		int rem = n % d;
		while (rem != 0) {
			rem = rem * 10;
			int k = rem / d;
			if (map.containsKey(k)) {
				int val=map.get(k);
				ans.insert(val, "(");
				ans.append(")");
				return ans.toString();

			} else {
				map.put(k, ans.length());
			}
			ans = ans .append(k);
			rem = rem % d;
		}
		return ans.toString();
	}
}
