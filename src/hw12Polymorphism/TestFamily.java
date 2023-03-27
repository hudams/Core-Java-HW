package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.sister(15, 18);
		sister.sister(26, 4, 58);
		sister.sister(14, 37, 46, "25");
		sister.sister(77, 49, "47", 66);
		sister.sister(22, 33, 44, 55, "66"); // Final return type method
		Sister.sister(14, 26, 32, "52", 44); // Static return type method
		sister.sister("19", 15, 12);
		sister.sister();
		sister.sister(9, 14, 17, 23);

		Niece niece = new Niece();
		niece.sister(16, 22);
		niece.sister(11, 58, 42);
		niece.sister(43, 3, 17, "19");
		niece.sister();
		niece.sister(35, 40, 45, 50);
	}

}
