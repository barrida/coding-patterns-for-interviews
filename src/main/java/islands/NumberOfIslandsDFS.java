package islands;

import java.util.Arrays;

/**
 * @author suleyman.yildirim
 */
public class NumberOfIslandsDFS {
	// Given a 2D array (i.e., a matrix) containing only 1s (land) and 0s (water), count the number of islands* in it.
	public static int countIslands(int[][] matrix) {

		int totalIslands = 0;

		System.out.println("...init...");
		for (int[] ints : matrix) {
			System.out.println(Arrays.toString(ints));
		}
		System.out.println();

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (matrix[row][col] == 1) {
					totalIslands++;
					traverseMatrixDFS(matrix, row, col);
				}
			}
		}
		return totalIslands;
	}

	private static void traverseMatrixDFS(int[][] matrix, int row, int col) {

		if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length)
			return;
		if (matrix[row][col] == 0)
			return;

		matrix[row][col] = 0;

		for (int[] ints : matrix) {
			System.out.println(Arrays.toString(ints));
		}

		System.out.println();
		// recursively visit all neighbours
		traverseMatrixDFS(matrix, row - 1, col); // upper neighbour
		traverseMatrixDFS(matrix, row + 1, col); // lower neighbour
		traverseMatrixDFS(matrix, row, col + 1); // right neighbour
		traverseMatrixDFS(matrix, row, col - 1); // left neighbour
	}
}
