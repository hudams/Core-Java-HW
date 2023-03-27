package hw9Abstraction;
/*
 * Extends keyword used for the inheritance 
 * Regular class can be inherit by extends keyword 
 * Abstract class can be inherit by extends keyword 
 * Interface can not be inherit by extends keyword. We can inherit interface by implements keyword
 * Multiple interface can be inherited
 */

public class ColumbiaUniversity extends NYUniversity {
	// Regular class cannot contain any abstract method. In order to declare a
	// abstract method we need to make the class abstract.
	/*
	 * public abstract void chemistry ();
	 */
	public void biology() {
		System.out.println("This a non abstract method from biology class");
	}

	public ColumbiaUniversity() {
		System.out.println("This is a default constructor from columbiaUniversity class");
	}
}
