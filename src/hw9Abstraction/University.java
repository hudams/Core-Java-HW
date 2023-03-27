package hw9Abstraction;

/*
 * Only extends keyword can be use for the inheritance in Interface 
 * Yes, an interface can inherit other Interfaces like College, Hospital
 * public interface University extends College, Hospital {}
 * Multiple inheritances are possible 
 */

public interface University{
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
