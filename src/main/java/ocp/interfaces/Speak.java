package ocp.interfaces;

/**
 * @author suleyman.yildirim
 */
public class Speak {
	public static void main(String[] args) {
		Speak s = new GoodSpeak();

		// All prints "UP UP UP"
		((GoodSpeak) s).up();
		((Tone) (GoodSpeak) s).up();
		((Tone) s).up();
	}
}


class GoodSpeak extends Speak implements Tone {
	public void up() {
		System.out.println("UP UP UP");
	}
}

interface Tone {
	void up();
}

// An interface may extend a sealed interface
final class V implements Q{}
final class Circle implements Shape{}

sealed interface Shape{}

sealed interface Q extends Shape{}