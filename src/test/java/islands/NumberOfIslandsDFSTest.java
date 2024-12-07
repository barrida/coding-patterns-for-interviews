package islands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class NumberOfIslandsDFSTest {

	@Test void countIslands() {

//		assertEquals(1, NumberOfIslandsDFS.countIslands(
//				new int[][] {
//						{ 0, 1, 1, 1, 0 },
//						{ 0, 0, 0, 1, 1 },
//						{ 0, 1, 1, 1, 0 },
//						{ 0, 1, 1, 0, 0 },
//						{ 0, 0, 0, 0, 0 }
//				}));

		assertEquals(3, NumberOfIslandsDFS.countIslands(
				new int[][] {
						{ 1, 1, 1, 0, 0 },
						{ 0, 1, 0, 0, 1 },
						{ 0, 0, 1, 1, 0 },
						{ 0, 0, 1, 0, 0 },
						{ 0, 0, 1, 0, 0 }
				}));

	}
}