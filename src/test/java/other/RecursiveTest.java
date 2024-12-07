package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class RecursiveTest {

	@Test void testRecursiveF() {
		new Recursive().f();
	}

	@Test void testInfiniteLoop() {
		new Recursive().g();
	}
}