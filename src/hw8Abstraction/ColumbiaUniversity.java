package hw8Abstraction;

public class ColumbiaUniversity {
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
