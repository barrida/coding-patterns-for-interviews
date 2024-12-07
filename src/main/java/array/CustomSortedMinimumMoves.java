package array;

import java.util.Arrays;

/**
 * @author suleyman.yildirim
 */
public class CustomSortedMinimumMoves {

	public static int move(int[] arr) {
		int moves = 0;
		for (int i = 0; i <= arr.length / 2 ; i++) {
			if (arr[i] % 2 != 0) {
				for (int j = arr.length / 2; j < arr.length; j++) {
					if (arr[j] % 2 == 0) {
						swap(arr, i, j);
						moves++;
						break;
					}
				}
			}
		}
		System.out.println("After custom sorting: " + Arrays.toString(arr));
		return moves;
	}

	private static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j] + ":     " + Arrays.toString(arr));
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
