package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author suleyman.yildirim
 */
class CustomSortedMinimumMovesTest {

	@Test void move() {
		assertEquals(1, CustomSortedMinimumMoves.move(new int[] { 6, 3, 4, 5, 2 }));
		assertEquals(1, CustomSortedMinimumMoves.move(new int[] { 13, 10, 21, 20 }));
		assertEquals(2, CustomSortedMinimumMoves.move(new int[] { 5, 8, 5, 11, 4, 6 }));
	}

}