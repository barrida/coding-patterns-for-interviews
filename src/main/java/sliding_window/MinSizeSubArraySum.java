package sliding_window;

/**
 * Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’.
 * <p>
 * Return 0 if no such subarray exists
 *
 * @author suleyman.yildirim
 */
public class MinSizeSubArraySum {
	public static int findMinSubArray(int[] arr, int S){
		int windowStart = 0;
		int sum = 0;
		int minLength = Integer.MAX_VALUE;
		for (int windowEnd = 0; windowEnd <arr.length ; windowEnd++) {
			sum += arr[windowEnd];
			// shrink the window as small as possible until the 'windowSum' is smaller than 'S'
			while (sum >= S) {
				minLength = Math.min(minLength, windowEnd - windowStart + 1);
				sum -= arr[windowStart]; // subtract the element going out
				windowStart++; // slide the window ahead
			}
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
}
