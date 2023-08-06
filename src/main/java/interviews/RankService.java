package interviews;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class RankService {

	private final Map<Integer, Integer> frequency;

	public RankService() {
		this.frequency = new TreeMap<>();
	}

	/**
	 * @param message
	 */
	public void processMessage(Message message){
		frequency.put(message.getId(), frequency.getOrDefault(message.getId(), 0) + message.getLikes());
	}

	public List<Map.Entry<Integer, Integer>> getRankedList(){
		return frequency.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toList())
				.subList(0, 2);
	}

	public Map<Integer, Integer> getFrequency() {
		return frequency;
	}

}
