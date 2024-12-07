package interviews;

public class MinMaxDifference {

	static int findDiff(int[] nums){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		return max - min;
	}
}
