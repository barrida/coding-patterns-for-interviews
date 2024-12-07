package sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author suleyman.yildirim
 */
class LongestSubstringKDistinctTest {

	@Test
	void findLongestSubstring() {
		assertEquals(4, LongestSubstringKDistinct.findLongestSubstring("araaci", 2));
		assertEquals(2, LongestSubstringKDistinct.findLongestSubstring("araaci", 1));
		assertEquals(5, LongestSubstringKDistinct.findLongestSubstring("cbbebi", 3));
		assertEquals(4, LongestSubstringKDistinct.findLongestSubstring("messi", 3));
		assertEquals(6, LongestSubstringKDistinct.findLongestSubstring("kapuciinooo", 3));
	}
}