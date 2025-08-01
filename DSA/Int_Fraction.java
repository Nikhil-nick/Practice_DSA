/*
 "Give two fractions, the numerator and denominator represented as a pair of ints,
    return them in their simplest form after adding them.

Examples:
    {Numerator_frac1 = 1, Denominator_frac1 = 3}                // 1/3
    {Numerator_frac2 = 3, Denominator_frac2 = 9}                // 3/9
    // Return Numerator_ans = 2, Denominator_ans = 3       // 2/3

    {Numerator_frac1 = 1, Denominator_frac1 = 2}               // 1/2
    {Numerator_frac2 = 3, Denominator_frac2 = 2}               // 3/2
    // Return Numerator_ans = 2, Denominator_ans = 1      // 2/1"
*/
package GS.DSA.DSA;

public class Int_Fraction {
	public static void main(String[] args) {
		int n1 = 1, d1 = 3, n2 = 3, d2 = 9;
		int num = n1 * d2 + d1 * n2;
		int den = d1 * d2;
		
		int hcd = hcd(num, den);
		//System.out.println(hcd);
		System.out.println(num/hcd);
		System.out.println(den/hcd);
	}

	private static int hcd(int num, int den) {
		int min = num < den ? num : den; int hcd=1;
		for(int i=2;i<=num;i++) {
			if(num%i==0 && den%i==0) {
				hcd=Math.max(hcd, i);
			}
		}
			
		return hcd;
	}
}
