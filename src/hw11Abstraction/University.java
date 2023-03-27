package hw11Abstraction;

/*
 * Only extends keyword can be used for the inheritance in Interface 
 * implements keyword can not be used in Interface to inherit 
 * YES, an interface can inherit multiple Interfaces like College, Hospital by extends keyword
 * public interface University extends College, Hospital {}
 * Multiple interfaces inheritance is possible 
 */

public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

	// interface cannot have constructor
	/*
	 * public University () {
	 * 
	 * }
	 */ 

	public default void gymnasium() {
		System.out.println("This is a default method from University Interface");
	}

	public static void library() {
		System.out.println("This is a static method from University Interface");
	}
}
