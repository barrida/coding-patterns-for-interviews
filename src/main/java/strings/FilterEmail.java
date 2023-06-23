package strings;

import java.util.Arrays;

public class FilterEmail {

	/**
	 * Return all email addresses that belongs to gmail (ending wth gmail.com)
	 *
	 * @param arr
	 * @return
	 */
	public String[] filterByGmail(String[] arr) {
		return Arrays.stream(arr).filter(email -> email.contains("gmail.com")).toArray(String[]::new);
	}
}
