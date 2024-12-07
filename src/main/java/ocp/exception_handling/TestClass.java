package ocp.exception_handling;

import java.io.IOException;

/**
 * @author suleyman.yildirim
 */

//assume appropriate imports
class PortConnector {

	// IOException is a checked exception and since the PortConnector constructor throws IOException, this exception (or its superclass) must be present in the throws clause of the constructor.
	// Now, the main method has two options, either catch IOException (or whatever exception PortConnector throws) in its catch block or put that exception in its throws clause.
	public PortConnector(int port) {
		//assume that random() returns a random value
		//between 0.0 (inclusive) and 1.0 (exclusive)

		if (Math.random() > 0.5) {
			// throw new IOException();
		}

		throw new RuntimeException();
	}

}



public class TestClass {

	// What two changes can you do, independent of each other, to make the following code compile?
	public static void main(String[] args) {
		try {
			PortConnector pc = new PortConnector(10);
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
	}
}

