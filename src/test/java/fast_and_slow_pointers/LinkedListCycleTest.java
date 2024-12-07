package fast_and_slow_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class LinkedListCycleTest {

	// 1 - 2 - 3 - 4 - 5 - 6 - 4
	@Test void hasCycle() {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = head.next.next.next;
		assertTrue(LinkedListCycle.hasCycle(head));
	}

	// 1 - 2 - 3 - 4
	@Test void hasNoCycle() {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		assertFalse(LinkedListCycle.hasCycle(head));
	}

}