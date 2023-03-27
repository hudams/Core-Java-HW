package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {

		// default constructor initialized
		Computer myComputerInfo = new Computer();

		// parameterized constructor initialized
		Computer myComputerInfo2 = new Computer("Apple", "MacBook Air", "MacOS Mojava", 800, 'A', false);
		
		// parameterized constructor initialized
		Computer myComputerInfo3 = new Computer("HP", "Spectre x360", "Windows 10", 'A', 1100, true);
	}

}
