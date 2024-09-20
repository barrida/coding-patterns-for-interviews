package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
}
