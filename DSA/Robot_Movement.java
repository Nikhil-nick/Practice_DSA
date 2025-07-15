//"Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
//return the final coordinates after traversing the string.
//
//Examples:
//Given (0,0) and String - ""UUU""
//    Answer : (0,3)
//
//Given (0,0) and String - ""URRDDL""
//    Answer : (1,-1)

package GS.DSA.DSA;
import java.util.*;
public class Robot_Movement {
	public static int[] finalCoordinates(String directions) {
		int x = 0, y = 0;

		for (char move : directions.toCharArray()) {
			switch (move) {
				case 'U': y++; break;
				case 'D': y--; break;
				case 'R': x++; break;
				case 'L': x--; break;
			}
		}

		return new int[]{x, y};
	}

	public static void main(String[] args) {
		 System.out.println(Arrays.toString(finalCoordinates("UUU"))); // [0, 3]
		 System.out.println(Arrays.toString(finalCoordinates("URRDDLL"))); // [0, -1]
	}
	
}