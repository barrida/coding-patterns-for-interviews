package array;

/**
 * @author suleyman.yildirim
 */
public class RotateArray {
	public static void leftRotate(int[] arr, int k) {
		for (int i = 0; i < k; i++) {
			int last = arr[arr.length - 1];
			// inner for-loop can be replaced by System.arraycopy(arr, 0, arr, 1, arr.length - 1);
			for (int j = arr.length - 1; j > 0; j--) {
				//Shift element of array by one
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
	}
}
