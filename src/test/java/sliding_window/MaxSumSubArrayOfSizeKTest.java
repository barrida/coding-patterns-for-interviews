package sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class MaxSumSubArrayOfSizeKTest {

	@Test void maxSumSubArray() {
		assertEquals(9, MaxSumSubArrayOfSizeK.maxSumSubArrayBruteForce(new int[]{2, 1, 5, 1, 3, 2}, 3));
		assertEquals(7, MaxSumSubArrayOfSizeK.maxSumSubArrayBruteForce(new int[]{2, 3, 4, 1, 5}, 2));
	}

	@Test void maxSumSubArraySlidingWindow() {
		assertEquals(9, MaxSumSubArrayOfSizeK.maxSumSubArraySlidingWindow(new int[]{2, 1, 5, 1, 3, 2}, 3));

	}
}