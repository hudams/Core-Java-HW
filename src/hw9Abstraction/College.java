package hw9Abstraction;

public interface College {
	public void commonRoom();

	public void labratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("This is default dorm method from College Interface");
	}

	public static void studyRoom() {
		System.out.println("This is static studyRoom method from College Interface");
	}
}
