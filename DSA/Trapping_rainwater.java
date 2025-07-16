//Rain Water Trapping

package GS.DSA.DSA;

import java.util.Arrays;

public class Trapping_rainwater {
	public static void main(String[] args) {
		int a[] = { 3, 0, 2, 0, 4 };
		int n = a.length; int ans=0;
		int l[] = new int[n];
		int r[] = new int[n];
		l[0] = a[0];
		r[n - 1] = a[n - 1];
		for (int i = 1; i < a.length ; i++) {
			l[i] = Math.max(l[i - 1], a[i]);
		}
		for (int i = a.length - 2; i >= 0; i--) {
			r[i] = Math.max(r[i + 1], a[i]);
		}
		
		//System.out.println(Arrays.toString(l));
		//System.out.println(Arrays.toString(r));
		
		for (int i = 0; i < a.length ; i++) {
			int min=Math.min(l[i], r[i]);
			ans=ans+min-a[i];
		}
		System.out.println(ans);
	}
}
