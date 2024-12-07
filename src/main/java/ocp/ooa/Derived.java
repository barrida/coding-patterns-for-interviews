package ocp.ooa;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author suleyman.yildirim
 */

class Base {
	public List<CharSequence> transform(Set<CharSequence> list) {
		//valid code
		return null;
	}

	void methodA(){
		System.out.println("base - MethodA");
	}
}

class Sub extends Base{
	public void methodA(){
		System.out.println("sub - MethodA");
	}
	public void methodB(){
		System.out.println("sub - MethodB");
	}
	public static void main(String args[]){
		Base b = new Sub(); //1
		b.methodA(); //2
		// For example, the compiler is able to verify that b.methodA() is a valid call because class Base has method methodA.
		// But it does not "bind" the call. Call binding is done at runtime by the jvm and
		// the jvm looks for the actual class of object referenced by the variable before invoking the method.

		// compile error: b.methodB(); #
		//
		// The point to understand here is, b is declared to be a reference of class Base and methodB() is not defined in Base.
		// So the compiler cannot accept the statement b.methodB()
		// because it only verifies the validity of a call by looking at the declared class of the reference.

	}
}

public class Derived extends Base {

	//valid code
	//	@Override
	//	public List<String> transformStrings(Set<String > list) {
	//		return null;
	//	}

	public List<Integer> transform(TreeSet<CharSequence> id) {
		return null;
	}
}

