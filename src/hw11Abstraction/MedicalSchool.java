package hw11Abstraction;


/*
 * extends & implements keyword is used for the inheritance in abstract class 
 * Abstract class can inherit one abstract class by "extends" keyword
 * Abstract class can inherit one regular class by "extends" keyword 
 * Abstract class can not inherit another interface by extends keyword, we need to use "implements" keyword to inherit interface in abstract class 
 * Multiple interfaces can be inherited by using "implements" keyword
 */

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomhyLab();

	public void biochemistryLab() {
		System.out.println("This is a non abastract method from abstract MedicalSchool class");
	}

	public static void medSchool() {
		System.out.println("This is static method from Medical School abstract class");
	}

	/*
	 * Default method is only allowed in Interface 
	 * public default void medSchoolDefault() { 
	 * 		System.out.println("This is a default method from Medical School abstract class"); 
	 * }
	 */

	public MedicalSchool() {
		System.out.println("This is a default constructor from MedicalSchool class");
	}
}
