package interviews;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void withIntermediateOperation() {

		// does not throw exception
		Stream.of(1, 2)
				.map(it -> {throw new RuntimeException("does not throw exception");});

	}

	public static void withTerminalOperation(){
		// throws exception
		Stream.of(1, 2)
				.map(it -> {throw new RuntimeException("throws exception");})
				.collect(Collectors.toList());

	}
}
