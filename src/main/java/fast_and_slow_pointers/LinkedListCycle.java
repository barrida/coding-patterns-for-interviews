package fast_and_slow_pointers;

/**
 * @author suleyman.yildirim
 */

class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
	}
}

public class LinkedListCycle {

	public static boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;
		}
		return false;
	}
}
