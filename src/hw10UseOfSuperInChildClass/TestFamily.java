package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("-------- This is default constructor initialized from parent class --------\n");
		Father father1 = new Father();

		System.out.println("\n-------- This is parameter constructor initialized from parent class --------\n");
		Father father2 = new Father("Absar", 55, 'M', false);

		System.out.println("\n-------- This is default constructor initialized from child class --------\n");
		Daughter daughter1 = new Daughter();

		System.out.println("\n-------- This is parameter constructor initialized from child class --------\n");
		Daughter daughter2 = new Daughter("January", 19);
		
		System.out.println("\n------ These methods from parent class Father using Father1 object keyword ------\n");
		father1.father();
		father1.fatherInfo("Parves", 38, 'M', false);
		
		System.out.println("\n------ These methods from parent class Father using Father2 object keyword ------\n");
		father2.father();
		father2.fatherInfo("Ismail", 58, 'M', true);
		
		System.out.println("\n------ These methods from child class Daughter using Daughter1 object keyword ------\n");
		daughter1.daughter();
		daughter1.daughterInfo("May", 15);
		
		System.out.println("\n------ These methods from child class Daughter using Daughter2 object keyword ------\n");
		daughter2.daughter();
		daughter2.daughterInfo("October", 22);
	}
}
