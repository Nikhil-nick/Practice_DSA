//"We are given a chess board and a piece with a fixed position (immoveable). We also have a bishop on the board which, well of course, can only move diagonally.
//    - Return ""YES"" if we can reach the immoveable piece using the bishop, else return ""NO"".
//    - If ""YES"", return the number of minimum steps it takes for the bishop to reach the immoveable piece."

package GS.DSA.DSA;

public class Bishop_Movement {
	public static String steps(int x, int y, int t1, int t2) {
       
        if ((x + y) % 2 != (t1 + t2) % 2) {
            return "NO";
        }
        int k;
        if (x == t1 && y == t2) {
            k = 0; 
        } else if (Math.abs(x - t1) == Math.abs(y - t2)) {
            k = 1; 
        } else {
            k = 2; 
        }

        return "YES " + k;
    }

    public static void main(String[] args) {
    	
        int x = 1, y = 1;
        int t1 = 5, t2 = 5;

        System.out.println(steps(x, y, t1, t2));
    }
}
