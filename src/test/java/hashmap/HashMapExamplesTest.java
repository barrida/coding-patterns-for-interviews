package hashmap;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author suleyman.yildirim
 */
class HashMapExamplesTest {

	@BeforeEach void setUp() {
	}

	@Test void testCountFrequency() {
		assertEquals(Map.of(1,3,2,2,3,1), HashMapExamples.countFrequency(new int[] { 1, 2, 2, 1, 1, 3 }));
	}

	@Test void testSortEntrySetByValue() {
		// Arrange
		List<Map.Entry<Integer, Integer>> expected = new ArrayList<>();
		expected.add(new AbstractMap.SimpleEntry<>(1, 2));
		expected.add(new AbstractMap.SimpleEntry<>(4, 3));
		expected.add(new AbstractMap.SimpleEntry<>(66, 46));

		// Act
		final var actual = HashMapExamples.sortEntrySetByValue(Map.of(1, 2, 66, 46, 4, 3));

		// Assert
		assertEquals(expected, actual);
	}

	@Test void testSortEntrySetByKey() {
		// Arrange
		List<Map.Entry<Integer, Integer>> expected = new ArrayList<>();
		expected.add(new AbstractMap.SimpleEntry<>(1, 2));
		expected.add(new AbstractMap.SimpleEntry<>(4, 3));
		expected.add(new AbstractMap.SimpleEntry<>(66, 46));

		// Act
		final var actual = HashMapExamples.sortEntrySetByKey(Map.of(66, 46, 1, 2, 4, 3 ));

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	void testSortEntrySeyByTreeMap(){
		// Arrange
		List<Map.Entry<Integer, Integer>> expected = new ArrayList<>();
		expected.add(new AbstractMap.SimpleEntry<>(1, 2));
		expected.add(new AbstractMap.SimpleEntry<>(4, 3));
		expected.add(new AbstractMap.SimpleEntry<>(66, 46));

		// Act
		final var actual = HashMapExamples.sortEntrySeyByTreeMap(Map.of(66, 46, 1, 2, 4, 3 ));

		// Assert
		assertEquals(expected, actual);

	}
	@Test void testGetFirstOccurrenceOfNonRepeatedCharacter(){
		assertEquals('r', HashMapExamples.getFirstOccurrenceOfNonRepeatedCharacter("araba"));
		assertEquals('s', HashMapExamples.getFirstOccurrenceOfNonRepeatedCharacter("suleyman"));
		assertEquals('u', HashMapExamples.getFirstOccurrenceOfNonRepeatedCharacter("ssuleyman"));
	}
}