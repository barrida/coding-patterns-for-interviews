package sliding_window;

/**
 * Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
 *
 * Input: [2, 1, 5, 1, 3, 2], k=3
 * Output: 9
 * Explanation: Subarray with maximum sum is [5, 1, 3].
 *
 * @author suleyman.yildirim
 */
public class MaxSumSubArrayOfSizeK {

	public static int maxSumSubArrayBruteForce(int[] arr, int k ){
		int maxSum = 0;
		int windowSum;
		for (int i = 0; i <= arr.length - k; i++) {
			windowSum = 0;
			for (int j = i; j < i + k; j++) {
				windowSum +=arr[j];
			}
			maxSum = Math.max(windowSum, maxSum);
		}
		return maxSum;
	}
}
