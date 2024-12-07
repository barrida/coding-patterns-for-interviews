package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author suleyman.yildirim
 */
public class UniqueOccurrences {

	/**
	 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
	 *
	 * @param arr
	 * @return
	 */
	public static boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> frequency = new HashMap<>();
		Arrays.stream(arr).forEach(number -> frequency.put(number, frequency.getOrDefault(number, 0) + 1));
		Set<Integer> uniqueValues = new HashSet<>(frequency.values());
		return uniqueValues.size() == frequency.size();
	}
}
