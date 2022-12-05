package two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author suleyman.yildirim
 */
class TwoPointersTest {

	@Test
	void makeSquares() {
		int[] result = TwoPointers.makeSquares(new int[] { -4, -1, 0, 2, 3 });
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, result);
	}

	@Test
	void removeDuplicates() {
		int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
		assertEquals(4, TwoPointers.removeDuplicates(arr));
	}

	@Test
	void pairWithTargetSum() {
		int[] result = TwoPointers.pairWithTargetSum(new int[] { 1, 2, 3, 4, 6 }, 6);
		assertArrayEquals(new int[] { 1, 3 }, result);

		result = TwoPointers.pairWithTargetSum(new int[] { 2, 5, 9, 11 }, 11);
		assertArrayEquals(new int[] { 0, 2 }, result);
	}

}