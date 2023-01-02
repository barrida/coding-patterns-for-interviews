package strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @author suleyman.yildirim
 */
public class RemoveAllAdjacentDuplicates {

	/**
	 * You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.
	 * <p>
	 * This is a recursive solution, which is not efficient for very long strings
	 *
	 * @param s "deeedbbcccbdaa"
	 * @param k 3
	 * @return "aa"
	 */
	public static String removeDuplicatesRecursive(String s, int k) {
		int windowCountDuplicates = 0;
		int windowEnd = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				windowCountDuplicates++;
				windowEnd = i + 1;
			} else {
				windowCountDuplicates = 0;
			}
			if (k - 1 == windowCountDuplicates) {
				s = s.replace(s.substring(windowEnd - windowCountDuplicates, windowEnd + 1), "");
				return removeDuplicatesRecursive(s, k);
			}
		}
		return s;
	}

	/**
	 *
	 * @param s
	 * @param k
	 * @return
	 */
	public static String removeDuplicatesStackApproach1(String s, int k) {
		Deque<Character> stack = new ArrayDeque<>();
		Map<Character, Integer> charFrequency = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			char prev = ' ';
			if (stack.peekLast() != null) {
				prev = stack.peekLast();
			}
			stack.addLast(current);
			charFrequency.put(current, charFrequency.getOrDefault(current, 0) + 1);
			if (prev == current && charFrequency.get(current) >= k) {
				for (int j = 0; j < k; j++) {
					charFrequency.put(current, charFrequency.get(current) - 1);
					stack.removeLast();
				}
			}
		}

		StringBuilder str = new StringBuilder();
		for (Character c : stack) {
			str.append(c);
		}
		return str.toString();
	}

	public static String removeDuplicatesStackApproach2(String s, int k) {
		Deque<Map<Character, Integer>> stack = new ArrayDeque<>();
		for (char ch : s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek().containsKey(ch)) {
				var top = stack.peek();
				top.put(ch, top.get(ch) + 1);
			} else {
				var map = new HashMap<Character, Integer>();
				map.put(ch, 1);
				stack.push(map);
			}
			assert stack.peek() != null;
			if (stack.peek().get(ch) == k) {
				stack.pop();
			}
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			var top = stack.pop();
			for (var entrySet : top.entrySet()) {
				sb.append(String.valueOf(entrySet.getKey()).repeat(Math.max(0, entrySet.getValue())));
			}
		}
		return sb.reverse().toString();
	}
}
