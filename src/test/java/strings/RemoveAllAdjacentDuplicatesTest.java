package strings;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class RemoveAllAdjacentDuplicatesTest {

	private String longStr;

	@BeforeEach void setUp() throws IOException {
		FileInputStream fis = new FileInputStream("src/test/resources/longString.txt");
		longStr = IOUtils.toString(fis, StandardCharsets.UTF_8);
	}

	@Test void removeDuplicates() {
		assertEquals("d", RemoveAllAdjacentDuplicates.removeDuplicatesRecursive("deee", 3));
		assertEquals("ddbb", RemoveAllAdjacentDuplicates.removeDuplicatesRecursive("deeedbbccc", 3));
		assertEquals("abcd", RemoveAllAdjacentDuplicates.removeDuplicatesRecursive("abcd", 2));
		assertEquals("ps", RemoveAllAdjacentDuplicates.removeDuplicatesRecursive("pbbcggttciiippooaais", 2));
		assertEquals("ps", RemoveAllAdjacentDuplicates.removeDuplicatesRecursive(longStr, 2));
	}

	@Test void removeDuplicatesStackApproach1() throws IOException {
		assertEquals("d", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach1("deee", 3));
		assertEquals("ddbb", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach1("deeedbbccc", 3));
		assertEquals("abcd", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach1("abcd", 2));
		assertEquals("ps", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach1("pbbcggttciiippooaais", 2));
		assertEquals("pctacd", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach1("pctabbcd", 2));
		assertEquals("ybth", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach1("yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy", 4));
		assertEquals("ps", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach1(longStr, 2));
	}

	@Test void removeDuplicatesStackApproach2() throws IOException {
		assertEquals("d", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach2("deee", 3));
		assertEquals("ddbb", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach2("deeedbbccc", 3));
		assertEquals("abcd", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach2("abcd", 2));
		assertEquals("ps", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach2("pbbcggttciiippooaais", 2));
		assertEquals("pctacd", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach2("pctabbcd", 2));
		assertEquals("ybth", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach2("yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy", 4));
		assertEquals("", RemoveAllAdjacentDuplicates.removeDuplicatesStackApproach2(longStr, 2));
	}
}
