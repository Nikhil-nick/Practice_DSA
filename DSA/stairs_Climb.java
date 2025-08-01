/*
 "A staircase with n steps is given. Starting from the base,
    return the number of ways of reaching the n’th stair.
    [The person can climb either 1 or 2 stairs in one move]."
*/
package GS.DSA.DSA;
public class stairs_Climb {
	public static void main(String[] args) {
		int n = steps(3);
		System.out.println(n);
	}
	private static int steps(int n) {
		if (n == 1 || n == 2)
			return n;
		return steps(n - 2) + steps(n - 1);
	}
}
