package interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author suleyman.yildirim
 */
class StringManupilationTest {

	@Test
	void manipulate_SimpleInput_Success() {
		var expected = "<b>abc</b>xyz<b>123</b>";
		assertEquals(expected, StringManupilation.manipulate("abcxyz123", new String[]{"abc", "123"}));
		assertEquals(expected, StringManupilation.manipulate("abcxyz123", new String[]{"123", "abc"}));
	}

	@Test
	void manipulate_ComplexInput_Success(){
		assertEquals("<b>aaabbc</b>c", StringManupilation.manipulate("aaabbcc", new String[]{"aaa","aab","bc"}));

		/**
		 *  		is (aab subset of aaa) {
		 *  			add the most overlap
		 *
		 *  	aaa aab -> aaab
		 *      aaab bc -> aaabbc
		 *                }
		 */

		assertEquals("abc<b>xyz</b>123", StringManupilation.manipulate("abcxyz123", new String[]{"xy", "yz"}));

	}

	@Test
	void manipulate_EmptySubstring() {
		var expected = "abcxyz123";
		var actual = StringManupilation.manipulate("abcxyz123", new String[]{""});
		assertEquals(expected, actual);
	}

	@Test
	void  test_findMaxOverlap() {
		assertEquals("aaabbc", StringManupilation.findMaxOverlap( new String[]{"aaa","aab","bc"}));
	}
}