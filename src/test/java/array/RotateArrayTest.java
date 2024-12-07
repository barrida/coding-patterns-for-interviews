package array;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author suleyman.yildirim
 */
class RotateArrayTest {

	@Test
	void leftRotate() {

		int[] arr = new int[] {1,2,3,4,5,6,7};
		int k = 3;
		RotateArray.leftRotate(arr, k);

		assertEquals("[5, 6, 7, 1, 2, 3, 4]", Arrays.toString(arr));

	}
}