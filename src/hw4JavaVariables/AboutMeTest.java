package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		// Constructor initialized here
		AboutMe person1 = new AboutMe();
		// Variables are initialized here for Me
		person1.name = "Mohammed Huda";
		person1.age = 25;
		person1.sex = 'M';
		person1.weight = 140.46586f;
		person1.height = 154.6481647546873574;
		person1.USCitizen = true;
		person1.personalCarValue = 31894;
		person1.personalHouseValue = 2100456357;
		person1.totalPersonalAsset = 9211457023854775807l;
		person1.aboutMe(); // Method initialized here
		System.out.println("\n-----------------------------------------------------------------\n");
		// Constructor initialized here
		AboutMe person2 = new AboutMe();
		// Variables are initialized for Alex 
		person2.name = "Alex";
		person2.age = 52;
		person2.sex = 'M';
		person2.weight = 138.46586f;
		person2.height = 180.6481647546873574;
		person2.USCitizen = true;
		person2.personalCarValue = 24894;
		person2.personalHouseValue = 1900856344;
		person2.totalPersonalAsset = 9111444023879775845l;
		person2.aboutMe();
	}

}
