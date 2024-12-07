package interviews;

import java.util.Arrays;
import java.util.List;

/**
 * @author suleyman.yildirim
 */
public class StringManupilation {

	public static final String TAG_START = "<b>";
	public static final String TAG_END = "</b>";

	/**
	 * @param input      abcxyz123
	 * @param substrings [abc, 123]
	 * @return manipulated string <b>abc</b>xyz<b>123</b>
	 */
	public static String manipulate(String input, String[] substrings){

		if (input.isEmpty())
			return input;

		var sb = new StringBuilder(input);

		var sb2 = new StringBuilder();

		final List<String> list = Arrays.stream(substrings).sorted().toList();


		for (int i = 0; i < substrings.length - 1; i++) {
			if(substrings[i].charAt(substrings[i].length()-1) == substrings[i+1].charAt(0)){
				sb2.append(substrings[i]);
				sb2.append(substrings[i+1], 1, substrings.length - 1);
			} else {
				sb2.append(substrings[i+1]);
			}
		}

		for(String word : substrings) {
			sb2.append(word);
			if (input.contains(word)){
				//sb.insert(sb.indexOf(word), TAG_START);
				//sb.insert(sb.indexOf(word) + word.length(), TAG_END);
			}
		}

		return sb.toString();
	}

	public static String findMaxOverlap(String[] words) {
		String result = words[0];  // Start with the first word

		// Loop through the rest of the words
		for (int i = 1; i < words.length; i++) {
			String nextWord = words[i];
			int overlap = 0;

			// Sliding window approach to find the maximum overlap
			int maxOverlapLength = Math.min(result.length(), nextWord.length());
			for (int j = 0; j <= maxOverlapLength; j++) {
				// Check if the suffix of 'result' matches the prefix of 'nextWord'
				if (result.substring(result.length() - j).equals(nextWord.substring(0, j))) {
					overlap = j;
				}
			}

			// Merge the next word by adding only the non-overlapping part
			result += nextWord.substring(overlap);
		}

		return result;  // Return the final result


	}

	// Function to merge two words by finding the overlap and combining them
	public static String mergeStrings(String current, String next) {
		int overlap = 0;

		// Find the maximum overlap between the end of 'current' and the start of 'next'
		int minLength = Math.min(current.length(), next.length());
		for (int i = 1; i <= minLength; i++) {
			// Check if the end of 'current' matches the start of 'next'
			if (current.regionMatches(current.length() - i, next, 0, i)) {
				overlap = i;
			}
		}

		// Merge by appending the non-overlapping part of 'next' to 'current'
		return current + next.substring(overlap);
	}
}
