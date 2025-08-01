/*
"Given a sorted rotated array,
    return the minimum element from it.

Examples:
    int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1

    int[] arr2 = {1, 2, 3, 4};            //Return 1"
*/
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