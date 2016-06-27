package per.ds.override;

public class Test {
	
	public static void foo() {
		System.out.println("static foo()");
	}

	public static void foo(int i) {
		System.out.println("static foo(int i)");
	}

	// duplicate method
	// public void foo(int i) {
	// }

	// An instance method cannot override a static method, and a static method
	// cannot hide an instance method. For example, the following program has
	// two compiler errors.
	// http://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/
}
