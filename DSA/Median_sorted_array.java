/*
 "Find the median of two sorted arrays of different sizes.

Example:
arr1[] = {2, 3, 5, 8}
arr2[] = {10, 12, 14, 16, 18, 20}

Return 11 as the median"
*/
package GS.DSA.DSA;

import java.util.*;

public class Median_sorted_array {
	static double medianOf2(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int k = 0, j = 0;
		for (int i = 0; i < c.length; i++) {
			if (k < a.length) {
				c[i] = a[k];
				k++;
			} else {
				c[i] = b[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		int len = c.length;
		// If length of array is even
		if (len % 2 == 0)
			return (c[len / 2] + c[len / 2 - 1]) / 2.0;

		else
			return c[len / 2];
	}

	public static void main(String[] args) {
		int[] a = { -5, 3, 6, 12, 15 };
		int[] b = { -12, -10, -6, -3, 4, 10 };

		System.out.println(medianOf2(a, b));
	}
}