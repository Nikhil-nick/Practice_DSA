/*
 "The following is a puzzle. You could code this but ideally you're supposed to (or asked to) give the answer by solving it on paper.

You are given 100 bulbs. There are going to be 100 iterations, in each iteration you toggle the switch for bulbs numbered by the multiples of the iterating variable. Return the number of bulbs remaining after all the 100 passes.

    As in, in the 1st iteration - all the bulbs with the multiples of 1 would be toggled.
in the 2nd iteration - all the bulbs with only multiples of 2 would be toggled.      "
*/
package GS.DSA.DSA;

public class Light_Bulb {
	public static void main(String[] args) {
		int bulbs=100;
		int count=0;
		for (int i = 1; i*i <= bulbs; i++) {
			count++;
		}
		System.out.println(count);
	}
}
