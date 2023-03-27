package hw10Abstraction;
/*
 * extends & implements keywords are used for the inheritance in regular class 
 * A regular class can inherit another regular class by "extends" keyword 
 * Abstract class can be inherit by "extends" keyword in regular class
 * For abstract class we have to override unimplemented methods from abstract class to regular class by "@override" annotation because regular class can not contain declared methods. Methods have to be implemented in regular class.  
 * Interface can not be inherit by "extends" keyword. We can inherit interface by "implements" keyword
 * For interface we have to override unimplemented methods from interface to regular class by "@override" annotation because regular class can not contain declared methods. Methods have to be implemented in regular class.
 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	// Regular class cannot contain any abstract method. In order to declare a
	// abstract method we need to make the class abstract.
	/*
	 * public abstract void chemistry ();
	 */
	public void biology() {
		System.out.println("This a non abstract method from biology class");
	}

	public ColumbiaUniversity() {
		System.out.println("This is a default constructor from columbiaUniversity class");
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomhyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void labratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}
}
