package subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author suleyman.yildirim
 */
public class Permutations {
	public static List<List<Integer>> findPermutations(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Queue<List<Integer>> permutations = new LinkedList<>();
		permutations.add(new ArrayList<>());
		for (int currentNumber : nums) {
			for (int i = 0; i < permutations.size(); i++) {
				List<Integer> oldPermutation = permutations.poll();
				for (int j = 0; j <= oldPermutation.size(); j++) {
					List<Integer> newPermutation = new ArrayList<>(oldPermutation);
					newPermutation.add(j, currentNumber);
					if (newPermutation.size() == nums.length) {
						result.add(newPermutation);
					} else {
						permutations.add(newPermutation);
					}
				}
			}
		}
		return result;
	}

}
