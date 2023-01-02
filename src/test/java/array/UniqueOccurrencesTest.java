package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class UniqueOccurrencesTest {

	@Test void uniqueOccurrences() {
		assertTrue(UniqueOccurrences.uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
		assertFalse(UniqueOccurrences.uniqueOccurrences(new int[] { 1, 2 }));
		assertTrue(UniqueOccurrences.uniqueOccurrences(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));
		assertFalse(UniqueOccurrences.uniqueOccurrences(
				new int[] { 26, 2, 16, 16, 5, 5, 26, 2, 5, 20, 20, 5, 2, 20, 2, 2, 20, 2, 16, 20, 16, 17, 16, 2, 16, 20, 26, 16 }));

	}
}