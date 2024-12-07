package sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring in it with no more than K distinct characters.
 *
 * @author suleyman.yildirim
 */
public class LongestSubstringKDistinct {
	public static int findLongestSubstring(String str, int k) {
		int windowStart = 0;
		int maxLength = Integer.MIN_VALUE;
		Map<Character, Integer> frequency = new HashMap<>();
		char[] chars = str.toCharArray();
		for (var windowEnd = 0; windowEnd < chars.length; windowEnd++) {
			char charWindowEnd = chars[windowEnd];
			frequency.put(charWindowEnd, frequency.getOrDefault(charWindowEnd, 0) + 1);
			while (frequency.size() > k) {
				char charWindowStart = chars[windowStart];
				frequency.put(charWindowStart, frequency.get(charWindowStart) - 1);
				if (frequency.get(charWindowStart) == 0)
					frequency.remove(charWindowStart);
				windowStart++;
			}
			maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
		}
		return maxLength;
	}
}
