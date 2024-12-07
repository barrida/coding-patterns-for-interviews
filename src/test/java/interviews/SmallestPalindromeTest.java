package interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestPalindromeTest {

	@Test
	void findSmallestPalindrome() {
		assertEquals(111, SmallestPalindrome.findSmallestPalindrome(101));
		assertEquals(34543, SmallestPalindrome.findSmallestPalindrome(34500));
	}
}