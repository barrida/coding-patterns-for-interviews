package strings;

/***
 * Swap the fist and last characters of the string.
 */
public class SwapCharacters {
	public String swap(String s) {
		if(s.isEmpty())
			return s;
		char[] chars = s.toCharArray();
		chars[chars.length - 1] = s.charAt(0);
		chars[0] = s.charAt(s.length() - 1);
		return new String(chars);
	}

	public String swapUsingSubstring(String s) {
		return s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);
	}
}
