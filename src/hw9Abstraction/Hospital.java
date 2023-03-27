package hw9Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeyRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("This is default morgue method from Hospital Interface");
	}

	public static void pharmacy() {
		System.out.println("This is static pharmacy method from Hospital Interface");
	}
}
