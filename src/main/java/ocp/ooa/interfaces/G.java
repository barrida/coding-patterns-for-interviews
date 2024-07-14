package ocp.ooa.interfaces;

import java.util.function.Supplier;

/**
 * @author suleyman.yildirim
 */
public abstract class G {

	abstract void x();
	private void foo() {

	}
}

interface F {

	// private int a; // interfaces cannot have non-public fields and instance fields

	// Fields of an interface are implicitly public, static, and final and they should be initialized

	public static final int x = 0;

	// interface methods can be default, static, private but they should have a body
	default void foo() {

	}

	static void x() {

	}

	private void p() {

	}

	// Methods are implicitly public and abstract.
	public abstract void d();
}

interface FX extends F {
	@Override default void foo(){
		System.out.println("overrides foo of interface F");
	}
}

//It is ok for a nested sealed class to omit the permits clause
sealed class XY { }


non-sealed class XYZ extends XY{

}
