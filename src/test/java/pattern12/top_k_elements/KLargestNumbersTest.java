package pattern12.top_k_elements;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author suleyman.yildirim
 */
class KLargestNumbersTest {

	@Test void findKLargestNumbers() {
		List<Integer> result = KLargestNumbers.findKLargestNumbers(new int[] { 3, 1, 5, 12, 2, 11 }, 3);
		assertEquals(List.of(5, 12, 11), result);
	}
}