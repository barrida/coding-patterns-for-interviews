package subsets;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author suleyman.yildirim
 */
class PermutationsTest {

	@Test void findPermutations() {
		List<List<Integer>> result = Permutations.findPermutations(new int[] { 1, 3, 5 });
		assertEquals(6, result.size());
		assertEquals("[[5, 3, 1], [3, 5, 1], [3, 1, 5], [5, 1, 3], [1, 5, 3], [1, 3, 5]]", result.toString());
	}
}