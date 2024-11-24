package hashmap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author suleyman.yildirim
 */
public class HashMapExamples {

	public static Map<Integer, Integer> countFrequency(int[] arr) {
		var map = new HashMap<Integer, Integer>();
		Arrays.stream(arr).forEach(x -> map.put(x, map.getOrDefault(x, 0) + 1));
		return map;
	}

	public static List<Map.Entry<Integer, Integer>> sortEntrySetByValue(Map<Integer, Integer> map) {
		return map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.toList();
	}

	public static List<Map.Entry<Integer, Integer>> sortEntrySetByKey(Map<Integer, Integer> map) {
		return map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.toList();
	}

	// TreeMap constructor orders according to the natural ordering of its keys
	public static List<Map.Entry<Integer, Integer>> sortEntrySeyByTreeMap(Map<Integer, Integer> map) {
		var treeMap = new TreeMap<>(map);
		return treeMap.entrySet().stream().toList();
	}

	public static Character getFirstOccurrenceOfNonRepeatedCharacter(String string) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (char s : string.toCharArray()) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		return map.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.findFirst()
				.map(Map.Entry::getKey)
				.orElse(null);
	}

	public static String orderWeight(String s) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] splittedString = s.split(" ");

		for(String number : splittedString) {
			int weight = calculateWeight(Integer.valueOf(number));
			map.put(number, weight);
		}

		// Sort the entries first by weight, then lexicographically by the key (number)

		// If the weights are the same, compare lexicographically by the number (key)
		var sortedList =  map.entrySet().stream()
				.sorted(Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getValue()).thenComparing(Map.Entry::getKey))
				.map(Map.Entry::getKey)  // Extract the original number (key)
				.toList();

		return String.join(" ", sortedList);
	}

	private static int calculateWeight(Integer value){
		int weight = 0;
		while(value != 0) {
			weight += value % 10;
			value = value / 10;
		}
		return weight;
	}
}
