package hw9Abstraction;

/*
 * extends & implements keyword is used for the inheritance 
 * Abstract class can inherit another abstract class by extends keyword
 * Abstract class can inherit another regular class by extends keyword 
 * Abstract class can not inherit another interface by extends keyword, we need to use implements keyword to inherit interface into regular class or abstract class 
 * Only One inheritance is possible for regular and abstract class. 
 * Multiple inheritance is possible for interface using implements keyword
 */
public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomhyLab();

	public void biochemistryLab() {
		System.out.println("This is a non abastract method from abstract MedicalSchool class");
	}

	public MedicalSchool() {
		System.out.println("This is a default constructor from MedicalSchool class");
	}
}
