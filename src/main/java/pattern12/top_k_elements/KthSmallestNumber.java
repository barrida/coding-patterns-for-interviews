package pattern12.top_k_elements;

import java.util.PriorityQueue;

/**
 * @author suleyman.yildirim
 */
public class KthSmallestNumber {
	public static int findKthSmallestNumber(int[] nums, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n1, n2) -> n2 - n1);
		// put first k numbers in the max heap
		for (int i = 0; i < k; i++)
			maxHeap.add(nums[i]);

		// go through the remaining numbers of the array, if the number from the array is
		// smaller than the top (biggest) number of the heap, remove the top number from
		// heap and add the number from array
		for (int i = k; i < nums.length; i++) {
			if (nums[i] < maxHeap.peek()) {
				maxHeap.poll();
				maxHeap.add(nums[i]);
			}
		}

		// the root of the heap has the Kth smallest number
		return maxHeap.peek();
	}
}
