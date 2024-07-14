package ocp.ooa.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author suleyman.yildirim
 */
public class StreamsCollectors {

	public static void main(String[] args) {

		// Collecting Using Basic Collectors

		System.out.println(getStream().collect(Collectors.joining(" ")));
		System.out.println(getStream().collect(Collectors.averagingInt(String::length)));

		TreeSet<String> result = getStream().filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result); // [tigers]

		//Collecting into Maps

		var map1 = getStream().collect(Collectors.toMap(a -> a.substring(0, 2), String::length));
		System.out.println(map1);

		var map2 = getStream().collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + ", " + s2));
		System.out.println(map2);
		System.out.println(map2.getClass());

		var map3 = getStream().collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + ", " + s2, TreeMap::new));
		System.out.println(map3);
		System.out.println(map3.getClass());

		// Collecting Using Grouping, Partitioning, and Mapping

		// we want to get groups of names by their length
		System.out.println(getStream().collect(Collectors.groupingBy(String::length)));

		// we don’t want a List as the value in the map and prefer a Set instead
		System.out.println(getStream().collect(Collectors.groupingBy(String::length, Collectors.toSet())));

		// We can even change the type of Map returned through yet another parameter
		final TreeMap<Integer, Set<String>> setTreeMap = getStream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		System.out.println(setTreeMap);

		final TreeMap<Integer, List<String>> listTreeMap = getStream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
		System.out.println(listTreeMap);

		// Partitioning is a special case of grouping. With partitioning, there are only two possible groups—true and false.
		// Partitioning is like splitting a list into two parts

		System.out.println(getStream().collect(Collectors.partitioningBy(s -> s.length() < 5)));

		System.out.println(getStream().collect(Collectors.partitioningBy(s -> s.length() < 5, Collectors.toSet())));

		// we can group by the length of the animal
		//name to see how many of each length we have

		System.out.println(getStream().collect(Collectors.partitioningBy(s -> s.length() < 5, Collectors.counting())));

		// The mapping() collectors are most useful when used in a multi-level reduction, such as downstream of a groupingBy or partitioningBy
		// Transforming Elements: Collectors.mapping allows for transforming elements in each group before collecting them

		List<String> items = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

		Map<Integer, List<String>> groupedByLengthAndUpperCase = items.stream()
				.collect(Collectors.groupingBy(
						String::length,
						Collectors.mapping(String::toUpperCase, Collectors.toList())
				));

		System.out.println(groupedByLengthAndUpperCase);
	}

	private static Stream<String> getStream() {
		return Stream.of("lions", "tigers", "bears");
	}

}
