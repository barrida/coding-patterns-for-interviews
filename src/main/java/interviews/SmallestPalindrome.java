package interviews;

public class SmallestPalindrome {
	private SmallestPalindrome() {
	}

	public static int findSmallestPalindrome(int k) {
		int num = k + 1;
		while (!isPalindrome(num)) {
			num++;
		}
		return num;
	}

	private static boolean isPalindrome(int num) {
		int reversed = 0;
		int original = num;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return original == reversed;
	}
}
