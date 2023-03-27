package hw11Abstraction;

public abstract class EngineeringSchool extends NYUniversity {
	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is a non absatract method from EngineeringSchool abstract class");
	}
}
