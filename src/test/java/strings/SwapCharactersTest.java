package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapCharactersTest {

	@Test void swap() {
		assertEquals("ooensic", new SwapCharacters().swap("coensio"));
		assertEquals("", new SwapCharacters().swap(""));
	}

	@Test void swapUsingString() {
		assertEquals("ooensic", new SwapCharacters().swapUsingSubstring("coensio"));
	}
}