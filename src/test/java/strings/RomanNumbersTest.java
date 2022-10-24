package strings;
import org.junit.jupiter.api.Test;
import strings.RomanNumbers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class RomanNumbersTest {

	@Test
	void shouldCreateRomanNumeral() {
		assertEquals("I", strings.RomanNumbers.createRomanNumeral(1));
		assertEquals("V", strings.RomanNumbers.createRomanNumeral(5));
		assertEquals("DCCXXXV", RomanNumbers.createRomanNumeral(735));
	}

	@Test
	void shouldThrowIllegalArgumentExceptionWhenNumberIsInvalid() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> RomanNumbers.createRomanNumeral(100000));
		assertEquals("N should be between 1 and 1000", exception.getMessage());

		Exception exception2 = assertThrows(IllegalArgumentException.class, () -> RomanNumbers.createRomanNumeral(0));
		assertEquals("N should be between 1 and 1000", exception2.getMessage());
	}
}