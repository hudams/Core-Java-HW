package hw4JavaVariables;

public class Quiz3 {
	public static void p() {
		System.out.println("A");
		p();
	}
	public static void main(String[] args) {
		System.out.println("B");
		p();
		System.out.println();
	}

}
