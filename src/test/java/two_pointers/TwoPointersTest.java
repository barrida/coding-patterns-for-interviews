package two_pointers;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

	@Test
	void pairWithTargetSumWithTriplets(){
		int[] arr = new int[]{-3, -2, -1, 0, 1, 1, 2};
		Set<List<Integer>> triplets = new LinkedHashSet<>();
		for (int i = 0; i < arr.length - 2; i++) {
			TwoPointers.pairWithTargetSumWithTriplets(arr, -arr[i], triplets, i + 1);
		}
		assertEquals(Set.of(List.of(-3, 1, 2), List.of(-2, 0, 2), List.of(-2, 1, 1), List.of(-1, 0, 1)), triplets);
	}

	@Test
	void findTriplets(){
		Set<List<Integer>> triplets = Set.of(List.of(-3, 1, 2), List.of(-2, 0, 2), List.of(-2, 1, 1), List.of(-1, 0, 1));
		assertEquals(triplets, TwoPointers.findTriplets(new int[]{-3, 0, 1, 2, -1, 1, -2}));

		Set<List<Integer>> triplets2 = Set.of(List.of(-5, 2, 3), List.of(-2, -1, 3));
		assertEquals(triplets2, TwoPointers.findTriplets(new int[]{-5, 2, -1, -2, 3}));
	}
}