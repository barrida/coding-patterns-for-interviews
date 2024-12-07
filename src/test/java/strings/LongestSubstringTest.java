package strings;

import org.junit.jupiter.api.Test;
import sliding_window.LongestSubstringDistinctCharacters;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class LongestSubstringTest {

	@Test void lengthOfLongestSubstring() {
		// abc
		assertEquals(3, LongestSubstringDistinctCharacters.lengthOfLongestSubstring("abcabcbb"));
		// b
		assertEquals(1, LongestSubstringDistinctCharacters.lengthOfLongestSubstring("bbbbb"));
		// wke
		assertEquals(3, LongestSubstringDistinctCharacters.lengthOfLongestSubstring("pwwkew"));
		// abc, cde
		assertEquals(3, LongestSubstringDistinctCharacters.lengthOfLongestSubstring("abccde"));
		// ab
		assertEquals(2, LongestSubstringDistinctCharacters.lengthOfLongestSubstring("abbbb"));
		// abc
		assertEquals(3, LongestSubstringDistinctCharacters.lengthOfLongestSubstring("aabccbb"));
	}
}