package per.ds.override;

public class Derive extends Base {

	public static void display() {
		System.out.println("Static from Derived");
	}

	public static void main(String args[]) {
		Base obj1 = new Derive();

		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		obj1.display(); // Base's display
		
		Derive obj2 = new Derive();
		obj2.display(); // Derive's display
	}
}
