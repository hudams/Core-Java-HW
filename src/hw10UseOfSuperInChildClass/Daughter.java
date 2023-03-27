package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		// This is parameterized constructor called from parent class by using super method 
		super("Abdul", 65, 'M', true);
		
		// Called default method from parent class by using super keyword
		super.father();
		
		// Called and initialized parameterized method from parent class by using super keyword 
		super.fatherInfo("Kuddus", 25, 'M', false);
		
		// Variable initialized from parent class using super keyword
		super.familyName = "Huda";
		
		System.out.println("\nThis is default constructor from child class Daughter");
	}
	
	// This is parameterized constructor from Daughter class
	public Daughter(String birthMonth, int age) {
		// this is super method from parent class father
		super();
		//super keyword used to call methods from parent class Father
		super.father();
		
		super.fatherInfo("Nurul", 35, 'M', false);
		
		System.out.println("\nThis is parameterized constructor from child class Daughter");
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month: " + birthMonth + "\nAge: " + age);
	}
	
	//This is default method from Daughter class
	public void daughter() {
		
		super.father();
		super.fatherInfo("John", 45, 'M', true);
		
		System.out.println("\nThis is a default method from child class Daughter");
	}
	
	// This is parameterized method from daughter class 
	public void daughterInfo(String birthMonth, int age) {
		
		super.father();
		super.fatherInfo("Harris", 50, 'M', true);
		
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\nThis is a parameterized method from child class Daughter");
		System.out.println("Birth month: " + birthMonth + "\nAge: " + age);
	}
}
