//"Given a matrix of size m * n,
//    return the miniimum path sum in the matrix.
//    [You start from the top-left corner of the matrix and may up, down and diagonally].

package GS.DSA.DSA;

public class MinFallPath {
	public static void main(String[] args) {
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };

		int result = minFallingPathSum(matrix);
		System.out.println("Minimum Falling Path Sum: " + result);

	}

	public static int minFallingPathSum(int[][] matrix) {
		int m = matrix.length; // number of rows
		int n = matrix[0].length; // number of columns
		int ans = Integer.MAX_VALUE;

		for (int j = 0; j < n; j++) {
			ans = Math.min(ans, solve(0, j, m, n, matrix));
		}

		return ans;
	}

	public static int solve(int i, int j, int m, int n, int[][] matrix) {
		if (i < 0 || i >= m || j < 0 || j >= n)
			return Integer.MAX_VALUE;
		if (i == m - 1)
			return matrix[i][j];

		int a = solve(i + 1, j - 1, m, n, matrix);
		int b = solve(i + 1, j, m, n, matrix);
		int c = solve(i + 1, j + 1, m, n, matrix);

		return matrix[i][j] + Math.min(a, Math.min(b, c));
	}
}
