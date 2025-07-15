//"Given a sorted array of non-negative integers of size n,
//    return the smallest missing integer.
//
//Examples:
//    int[] arr1 = {1, 2, 3, 4};    // Return 0
//
//    int[] arr2 = {0, 1, 3, 4};    // Return 2"

package GS.DSA.DSA;
public class Rotated_array {

	public static void main(String[] args) {
		int[] a = { 5, 6, 7,9, 4 };
		int left = 0, right = a.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (a[mid] > a[right]) {
				left = mid+1;
			} else
				right =mid;
		}
		System.out.println(a[left]);
	}
}