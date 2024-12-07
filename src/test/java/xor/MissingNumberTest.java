package xor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class MissingNumberTest {

	@Test void findMissingNumber() {
		assertEquals(3, MissingNumber.findMissingNumber(new int[] { 1, 5, 2, 6, 4 }));
	}
}