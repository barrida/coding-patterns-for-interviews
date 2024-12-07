package xor;

/**
 * @author suleyman.yildirim
 */
public class MissingNumber {
	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		// XOR all the numbers from 1 to n.
		int x1 = 1;
		for (int i = 2; i <= n; i++)
			x1 = x1 ^ i;

		// XOR all the numbers in the input array
		int x2 = arr[0];
		for (int i = 1; i < n-1; i++)
			x2 = x2 ^ arr[i];

		// missing number is the xor of x1 and x2
		return x1 ^ x2;
	}

}
