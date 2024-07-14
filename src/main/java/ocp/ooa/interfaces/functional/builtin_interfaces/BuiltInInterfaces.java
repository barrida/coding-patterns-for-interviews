package ocp.ooa.interfaces.functional.builtin_interfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author suleyman.yildirim
 */
public class BuiltInInterfaces {
	public static void main(String[] args) {

		// Supplier - get - Often used to construct new object

		Supplier<StringBuilder> s1 = StringBuilder::new;
		System.out.println(s1.get());

		// Consumer - accept - You use a Consumer when you want to do something with a parameter but not return anything.

		Consumer<String> c1 = System.out::println;
		c1.accept("Annie");

		// Predicate - test - Predicate is often used when filtering or matching. Both are very common operations

		Predicate<String> p = x -> x.isEmpty();
		p.test("osman");

		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
		System.out.println(b1.test("chicken", "chick"));
		System.out.println(b2.test("chicken", "chick"));

		// Function - apply - Turn an input to something just like f(x)=y

		Function<String, Integer> f = x -> x.length();
		f.apply("suleyman"); // 8

		BiFunction<String, String, String> b11 = String::concat;
		BiFunction<String, String, String> b22 = (string, toAdd) -> string.concat(toAdd);
		System.out.println(b11.apply("baby ", "chick")); // baby chick
		System.out.println(b22.apply("java", "world"));

		// A UnaryOperator - apply - transforms its value into one of the same type. For example, incrementing by one is a unary operation. In fact, UnaryOperator extends Function.

		UnaryOperator<Integer> u = x -> x + 1;
		System.out.println(u.apply(5));

		// A BinaryOperator - apply - merges two values into one of the same type. Adding two numbers is a binary operation.
		BinaryOperator<Integer> b = (a, d) -> a + d;
		System.out.println(b.apply(2, 5));
	}
}
