package two_pointers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author suleyman.yildirim
 */
public class TwoPointers {

	/**
	 * Problem: Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.
	 * <p>
	 * Input: [-4, -1, 0, 2, 3]
	 * Output: [0, 1, 4, 9, 16]
	 */
	public static int[] makeSquares(int[] arr) {
		int n = arr.length;
		int[] squares = new int[n];
		int highestSquareIdx = n - 1;
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int leftSquare = arr[left] * arr[left];
			int rightSquare = arr[right] * arr[right];
			if (leftSquare > rightSquare) {
				squares[highestSquareIdx--] = leftSquare;
				left++;
			} else {
				squares[highestSquareIdx--] = rightSquare;
				right--;
			}
		}
		return squares;
	}

	/**
	 * Given an array of sorted numbers, remove all duplicate number instances from it in-place, such that each element appears only once.
	 * The relative order of the elements should be kept the same and you should not use any extra space so that that the solution have a space complexity of O(1).
	 * <p>
	 * Move all the unique elements at the beginning of the array and after moving return the length of the subarray that has no duplicate in it.
	 * <p>
	 * <p>
	 * Input: [2, 3, 3, 3, 6, 9, 9]
	 * Output: 4
	 * Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
	 * <p>
	 * <p>
	 * Steps
	 * <p>
	 * nextNonDuplicate=1 i=0 arr[0] != arr[0], no
	 * <p>
	 * nextNonDuplicate=1 i=1 arr[0] != arr[1], yes, arr[nextNonDuplicate] <-- arr[i], [2, 3, 3, 3, 6, 9, 9]
	 * <p>
	 * nextNonDuplicate=2 i=2 arr[1] != arr[2], no
	 * <p>
	 * nextNonDuplicate=2 i=3 arr[1] != arr[3], no
	 * <p>
	 * nextNonDuplicate=2 i=4 arr[1] != arr[4], yes, arr[nextNonDuplicate] <-- arr[i], [2, 3, 6, 3, 6, 9, 9]
	 * <p>
	 * nextNonDuplicate=3 i=5 arr[2] != arr[5], yes, arr[nextNonDuplicate] <-- arr[i], [2, 3, 6, 9, 6, 9, 9]
	 * <p>
	 * nextNonDuplicate=4 i=6 arr[3] != arr[6], no
	 */

	public static int removeDuplicates(int[] arr) {
		int nextNonDuplicate = 1; // index of the next non-duplicate element
		System.out.println("initial array: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[nextNonDuplicate - 1] != arr[i]) {
				arr[nextNonDuplicate] = arr[i]; // arr[1] <- arr[1]
				System.out.println("non duplicate found and array is updated: " + Arrays.toString(arr));
				nextNonDuplicate++;
			}
		}
		return nextNonDuplicate;
	}

	/**
	 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
	 * <p>
	 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.
	 * <p>
	 * Input: [1, 2, 3, 4, 6], target=6
	 * Output: [1, 3]
	 * Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
	 *
	 * @param arr input array [1, 2, 3, 4, 6]
	 * @param targetSum target 6
	 * @return [1, 3]
	 */
	public static int[] pairWithTargetSum(int[] arr, int targetSum) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int currentSum = arr[left] + arr[right];
			if (currentSum == targetSum) {
				return new int[] {left, right}; // we found the pair
			}
			if (currentSum > targetSum)
				right--;
			else
				left++;
		}
		return new int[] { -1, -1 };
	}

	/**
	 * Given an array, we find a pair ‘Y’ and ‘Z’ such that X + Y + Z == 0.
	 * At this stage, our problem translates into finding a pair whose sum is equal to “−X”.
	 *
	 * @param arr       sorted array
	 * @param targetSum "-X"
	 * @param triplets  triplets that satisfy X + Y + Z = 0
	 * @param left      left pointer
	 */
	public static void pairWithTargetSumWithTriplets(int[] arr, int targetSum, Set<List<Integer>> triplets, int left) {
		int right = arr.length - 1;
		while (left < right) {
			int currentSum = arr[left] + arr[right];
			// we found the pair
			if (currentSum == targetSum) {
				triplets.add(Arrays.asList(-targetSum, arr[left], arr[right]));
			}
			if (currentSum > targetSum)
				right--;
			else
				left++;
		}
	}

	/**
	 * Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
	 * <p>
	 * After we sort the array, the problem can be translated into the slight modification of "Pair with Target Sum" problem.
	 *
	 * @param arr [-3, 0, 1, 2, -1, 1, -2]
	 * @return [[-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]]
	 */
	public static Set<List<Integer>> findTriplets(int[] arr) {
		Arrays.sort(arr);
		Set<List<Integer>> triplets = new LinkedHashSet<>();
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 1] == arr[i])
				continue;
			pairWithTargetSumWithTriplets(arr, -arr[i], triplets, i + 1);
		}
		return triplets;
	}
}
