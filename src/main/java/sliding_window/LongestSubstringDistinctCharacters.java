package sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * @author suleyman.yildirim
 */
public class LongestSubstringDistinctCharacters {

	/**
	 * Given a string, find the length of the longest substring, which has all distinct characters.
	 *
	 * @param s "abcabcbb"
	 *
	 * @return 3 The longest substring with distinct characters is "abc" and "cab".
	 */
	public static int lengthOfLongestSubstring(String s) {
		int windowStart = 0;
		int max = 0;
		Map<Character, Integer> freq = new HashMap<>();
		for (int windowEnd = 0; windowEnd < s.length() - 1; windowEnd++) {
			char rightChar = s.charAt(windowEnd);
			if (freq.containsKey(rightChar)){
				windowStart = Math.max(windowStart, freq.get(rightChar) + 1);
			}
			freq.put(rightChar, windowEnd);
			max = Math.max(max, windowEnd - windowStart + 1);
		}

		return max;
	}
}
