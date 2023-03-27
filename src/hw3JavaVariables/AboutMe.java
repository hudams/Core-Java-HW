package hw3JavaVariables;

public class AboutMe {
	// variable declared
	public int homework;

	// variable initialize
	public String name = "Mohammed Saimul Huda";
	public byte age = 25;
	public short accountBalance = -30478;
	public int mortgage = 215348694;
	public long favoriteNUMBER = 9199999999999999996l;
	public float weight = 147.1536f;
	public double height = 26.234465899;
	public char sex = 'M';
	public boolean citizenStatus = true;

	// Main method
	public static void main(String[] args) {

		// Instantiated AboutMe class inside the main method body
		// object created inside a method
		// saimul is object name
		AboutMe saimul = new AboutMe();

		// initializing variable here from AboutMe class which was declared
		saimul.homework = 3;

		// In homework it asked me to take 2 or 3 variables inside one sysout but I
		// brought all to make it more meaningful.
		System.out.println("This is my homework no: " + saimul.homework + "\nMy name is " + saimul.name + "."
				+ "\nI am " + saimul.age + " years old." + "\nI have high mortgage plan which is $" + saimul.mortgage
				+ " monthly."
				+ "\nDue to the high motgage payment and inflation, my account balance is in negative now which is $("
				+ saimul.accountBalance + ")."
				+ "\nBecause of all the pressure I am taking, I strated loosing my weight from depression which is came to "
				+ saimul.weight + " lbs from 160 lbs." + "\nAlso, I am a U.S. Citizen which is very "
				+ saimul.citizenStatus + ". But, does it matter? Yes, it does if I get a Federal job :)");
	}

}
