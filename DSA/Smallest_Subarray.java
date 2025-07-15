//"Given an array of integers and a sum K,
//    return the length of the shortest sub-array which matches the given sum. If it doesn't exist, return -1.
//    [Even a single integer can be considered as a sum.]
//
//Examples:
//    int[] arr = {2, 4, 6, 10, 2, 1}, K = 12        // Return 2
//
//    int[] arr = {5, 8, 50, 4}, K = 50                // Return 50 (A single integer may be considered as a sum)"

package GS.DSA.DSA;

public class Smallest_Subarray {
	public static int shortestSubarrayWithSum(int[] arr, int K) {
		int minLength = Integer.MAX_VALUE;

		for (int start = 0; start < arr.length; start++) {
			int currentSum = 0;

			for (int end = start; end < arr.length; end++) {
				currentSum += arr[end];

				if (currentSum == K) {
					int currentLength = end - start + 1;
					minLength = Math.min(minLength, currentLength);
					break;  // No need to extend this window further
				}
			}
		}

		return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
	}

	public static void main(String[] args) {
		int[] arr1 = {2, 4, 6, 10, 2, 1};
		int K1 = 12;
		System.out.println(shortestSubarrayWithSum(arr1, K1));  // Output: 2

		int[] arr2 = {5, 8, 50, 4};
		int K2 = 50;
		System.out.println(shortestSubarrayWithSum(arr2, K2));  // Output: 1
	}
}