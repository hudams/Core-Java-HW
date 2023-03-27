package hw4JavaVariables;

public class AboutMe {
	// Variables are declared here
	public String name;
	public byte age;
	public char sex;
	public float weight;
	public double height;
	public boolean USCitizen;
	public short personalCarValue;
	public int personalHouseValue;
	public long totalPersonalAsset;

	// Constructor created
	public AboutMe() {
		System.out.println("This is about us:");
	}

	// Method implemented here
	public void aboutMe() {
		System.out.println("\nHi, I am " + name + "\nMy age is " + age + "\nMy sex is " + sex + "\nMy weight is "
				+ weight + " and height is " + height + "\nI am a U.S. Citizen which is " + USCitizen
				+ "\nI drive a Japanees made car which cost $" + personalCarValue
				+ "\nI have a house in WNY which value is $" + personalHouseValue + "\nMy total asset value is $"
				+ totalPersonalAsset);
	}
}
