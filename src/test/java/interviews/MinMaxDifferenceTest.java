package interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxDifferenceTest {

	@Test void findDiff() {

		assertEquals(10, MinMaxDifference.findDiff(new int[] {4, 11, 3 ,6, 8, 9, 13}));
	}
}