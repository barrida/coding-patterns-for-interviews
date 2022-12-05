package top_k_elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author suleyman.yildirim
 */
class KthSmallestNumberTest {

	@Test
	void findKthSmallestNumber() {
		int result = KthSmallestNumber.findKthSmallestNumber(new int[] { 3, 1, 5, 12, 2, 11 }, 3);
		assertEquals(3, result);

	}
}