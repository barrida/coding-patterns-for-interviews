package subsets;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class SubsetsTest {

	@Test void findSubsets() {
		List<List<Integer>> result = Subsets.findSubsets(new int[] { 1, 3 });
		assertEquals("[[], [1], [3], [1, 3]]", result.toString());
	}
}