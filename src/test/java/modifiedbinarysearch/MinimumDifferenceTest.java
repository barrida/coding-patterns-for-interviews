package modifiedbinarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class MinimumDifferenceTest {

	@Test void shouldReturnMinimumDifference_WhenKeyExists() {
		assertEquals(3, MinimumDifference.searchMinDiffElement(new int[] { 1, 3, 8, 10, 15 }, 3));
		assertEquals(10, MinimumDifference.searchMinDiffElement(new int[] { 1, 3, 8, 10, 15 }, 10));
	}

	@Test void shouldReturnMinimumDifference_WhenKeyDoesNotExists() {
		assertEquals(10, MinimumDifference.searchMinDiffElement(new int[] { 1, 3, 8, 10, 15 }, 12));
		assertEquals(6, MinimumDifference.searchMinDiffElement(new int[] { 4, 6, 10 }, 7));
		assertEquals(10, MinimumDifference.searchMinDiffElement(new int[] { 4, 6, 10 }, 17));
	}

	@Test void shouldReturnMinimumDifference_EdgeCases() {
		assertEquals(1, MinimumDifference.searchMinDiffElement(new int[] { 1, 3, 8, 10, 15 }, -1));
		assertEquals(15, MinimumDifference.searchMinDiffElement(new int[] { 1, 3, 8, 10, 15 }, 17));

	}
}