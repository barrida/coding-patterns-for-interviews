package strings;

/**
 * @author suleyman.yildirim
 */
public class RomanNumbers {

	static int reverse(int number) {

		String numString = Integer.toString(number);

		StringBuilder sb = new StringBuilder(numString);
		String reversedString = sb.reverse().toString();

		int asd = Integer.parseInt(reversedString);

		return asd;
	}

	public static int getOpposite(int number) {
		return -number;
	}

	public static String createRomanNumeral(int n) {

		int[] values = 	  { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		String romanNumber = "";
		if (n < 1 || n > 1000)
			throw new IllegalArgumentException("N should be between 1 and 1000");

		for (int i = 0; i < values.length; i++) {
			while (n >= values[i]) {
				n = n - values[i];
				romanNumber += symbols[i];
				System.out.println(romanNumber);
			}
		}

		return romanNumber;
	}

	public static void main(String[] args) {

		/**
		 * There will be an "integer overflow" if the number is less than or equal to the minimum integer value (INTEGER.MIN_VALUE). We need to throw an Illegal Argument exception or return a default value in those cases.
		 *
		 * if(number == INTEGER.MIN_VALUE) {
		 *  throw new IllegalArgumentException(String.format("Overflow: value (%d) is less than INTEGER.MIN_VALUE", number));
		 * }
		 *
		 * The String class does not have a reverse() function. Use StringBuilder instead as below:
		 *
		 * StringBuilder sb = new StringBuilder(numString);
		 * String reversedString = sb.reverse().toString();
		 *
		 *
		 * We can return the inline variable such as return Integer.parseInt(reversedString);
		 *
		 * It is better to return the inline variable as a best practice, such as return Integer.parseInt(reversedString);
		 *
		 *
		 * Another solution without using StringBuilder is dividing the number by 10 until the remainder is 0. For each iteration, increase a "count" variable, and accumulate the remainder by multiplying them by 10 to the power of the "count" variable.
		 */
		System.out.println(reverse(12345));

		System.out.println(getOpposite(Integer.MIN_VALUE));
	}

}
