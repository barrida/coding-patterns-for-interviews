package interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StreamsTest {

	@Test void testWithIntermediateOperation() {
		Streams.withIntermediateOperation();
	}

	@Test
	void testWithTerminalOperationThrowsException() {
		assertThrows(RuntimeException.class, Streams::withTerminalOperation);
	}





}