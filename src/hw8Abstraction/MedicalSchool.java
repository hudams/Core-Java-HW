package hw8Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomhyLab();
	public void biochemistryLab () {
		System.out.println("This is a non abastract method from abstract MedicalSchool class");
	}
	public MedicalSchool() {
		System.out.println("This is a default constructor from MedicalSchool class");
	}
}
