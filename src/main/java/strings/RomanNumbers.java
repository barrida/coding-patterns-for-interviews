package strings;

/**
 * @author suleyman.yildirim
 */
public class RomanNumbers {
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

	public static String createRomanNumeralMap(int n) {

		return null;
	}
}
