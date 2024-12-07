package strings;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterEmailTest {

	@Test void filterByGmail() {
		assertEquals(Arrays.toString(new String[] { "asd@gmail.com", "sy@gmail.com" }),
					 Arrays.toString(new FilterEmail().filterByGmail(new String[] { "asd@gmail.com", "asd@yahoo.com", "sy@gmail.com" }))
		);
	}
}