//Check whether a number is a power of 10.

package GS.DSA.DSA;

public class PowerOf10Check {

	public static boolean isPowerOf10(int n) {
		if (n <= 0) {
			return false;
		}

		while (n % 10 == 0) {
			n /= 10;
		}

		return n == 1;
	}

	public static void main(String[] args) {
		int num = 100000;

		if (isPowerOf10(num)) {
			System.out.println(num + " is a power of 10.");
		} else {
			System.out.println(num + " is NOT a power of 10.");
		}
	}
}
