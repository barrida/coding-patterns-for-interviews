package ocp.ooa;

/**
 * @author suleyman.yildirim
 */

interface Flyer {
	String getName();
}

class Bird implements Flyer {
	public String name;

	public Bird(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Eagle extends Bird {
	public Eagle(String name) {
		super(name);
	}
}

class Game {
	public void play() throws Exception {
		System.out.println("Playing Game...");
	}
}

class Soccer extends Game {
	public void play(String ball) {
		System.out.println("Playing Soccer with " + ball);
	}
}

class A {
	public int getCode() {
		return 2;
	}
}

class AA extends A {
	//public long getCode(){ return 3;} // 'getCode()' in 'ocp.ooa.AA' clashes with 'getCode()' in 'ocp.ooa.A'; attempting to use incompatible return type
}

class Point {
	int x, y;
}

class ColoredPoint extends Point {
	int color;
}

public class TestClass {

	static void test(ColoredPoint p, Point q) {
		int i = 100;
		byte b = (byte) i; // Explicit narrowing conversion

		System.out.println("(ColoredPoint, Point)");
	}

	static void test(Point p, ColoredPoint q) {
		System.out.println("(Point, ColoredPoint)");
	}

	public static void main(String[] args) throws Exception {
		Game g = new Soccer();
		// 1
		Soccer s = (Soccer) g;
		// 2
		s.play("ball");

		ColoredPoint cp = new ColoredPoint();
		// test(cp, cp); // Ambiguous method call.

		Flyer f = new Eagle("American Bald Eagle");
		System.out.println(f.getName());
		System.out.println(((Eagle)f).name);
		System.out.println(((Bird)f).name);

	}
}