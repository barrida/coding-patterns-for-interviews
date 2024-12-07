package subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suleyman.yildirim
 */
public class Subsets {

	public static List<List<Integer>> findSubsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();
		subsets.add(new ArrayList<>());
		for (int currentNumber : nums) {
			int n = subsets.size();
			for (int i = 0; i < n; i++) {
				List<Integer> set = new ArrayList<>(subsets.get(i));
				set.add(currentNumber);
				subsets.add(set);
			}
		}
		return subsets;
	}

}
