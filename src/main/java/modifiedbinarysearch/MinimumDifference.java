package modifiedbinarysearch;

/**
 * @author suleyman.yildirim
 */
public class MinimumDifference {
	public static int searchMinDiffElement(int[] arr, int key) {

		//edge cases
		if (key < arr[0])
			return arr[0];

		if (key > arr[arr.length - 1])
			return arr[arr.length - 1];

		// binary search
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int middle = start + (end - start) / 2;
			if (key < arr[middle])
				end = middle - 1;
			else if (key > arr[middle])
				start = middle + 1;
			else
				return arr[middle];
		}

		// if key is not found, min difference must be either at index "start -1" or "end -1"
		if ((key - arr[start - 1]) < (key - arr[end - 1])) {
			return arr[start - 1];
		} else {
			return arr[end - 1];
		}

	}
}
