package sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class MinSizeSubArraySumTest {

	@Test
	void findMinSubArray() {
		assertEquals(2, MinSizeSubArraySum.findMinSubArray(new int[]{2, 1, 5, 2, 3, 2}, 7));
		assertEquals(1, MinSizeSubArraySum.findMinSubArray(new int[]{2, 1, 5, 2, 8}, 7));
		assertEquals(3, MinSizeSubArraySum.findMinSubArray(new int[]{3, 4, 1, 1, 6}, 8));
		assertEquals(0, MinSizeSubArraySum.findMinSubArray(new int[]{3, 4, 1, 1, 6}, 215));
	}
}