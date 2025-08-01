/*
	"Given an array of integers (positive and negative),
    return length of the loop, if it exists. Else return -1.
    [ Rules for the movement - Index to move to,
        for +ve numbers - (i + arr[i])%n
        for -ve numbers - (i - arr[i])%n ]

Example:
    int[] arr = {2, -1, 1, 2, 2}
    // Returns 3  [There is a loop in this array because 0 moves to 2, 2 moves to 3, and 3 moves to 0.]"
*/
package GS.DSA.DSA;

public class Circular_arrayloop {
	public static boolean circularArrayLoop(int[] a) {
		int n = a.length;
		boolean dir = false;
		if (n <= 1)
			return false;
		for (int i = 0; i < n; i++) {
			dir = a[i] > 0;
			int slow, fast;
			slow = fast = i;
			int count = 0;
			while (true) {
				count++;
				slow = getNextIdx(a, slow, dir);
				if (slow == -1)
					break;
				fast = getNextIdx(a, fast, dir);
				if (fast == -1)
					break;
				fast = getNextIdx(a, fast, dir);
				if (fast == -1)
					break;

				if (slow == fast) {
					System.out.println(count);
					return true;
				}

			}

		}
		return false;
	}

	private static int getNextIdx(int[] a, int index, boolean dir) {
		// TODO Auto-generated method stub
		boolean curr = a[index] > 0;
		if (curr != dir) {
			return -1;
		}
		int nextIndex = (index + a[index]) % a.length;
		if (nextIndex < 0)
			nextIndex = nextIndex + a.length;
		if (index == nextIndex)
			return -1;
		return nextIndex;
	}

	public static void main(String[] args) {
		int[] arr = { 2,1,2,1};
		System.out.println(circularArrayLoop(arr)); 
	}
}
