package hw5Q2Constructor;

public class Computer {
	String brand;
	String model;
	String operatingSystem;
	int price;
	char grade;
	boolean madeInUSA;

	// default constructor declared
	public Computer() {
		System.out.println("This is from the default constructor of Computer class.");
	}
	// parameterized constructor declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: $" + price + ", Grade: " + grade + ", Made in the USA? Ans: " + madeInUSA);
	}
	// parameterized constructor declared
	public Computer(String brand, String model, String operatingSystem, char grade, int price, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.grade = grade;
		this.price = price;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: $" + price + ", Grade: " + grade + ", Made in the USA? Ans: " + madeInUSA);
	}

	/*
	 * 
	 * 
	 * public Computer (String brand, String model) {
	 * System.out.println("My computer brand name is: " + brand + " . Model is: " +
	 * model); }
	 * 
	 * public Computer (String brand, String model, String operatingSystem) {
	 * System.out.println("My computer brand name is: " + model + " . Model is: " +
	 * model + " . Operating system is: " + operatingSystem); }
	 * 
	 * public Computer (String brand, String model, String operatingSystem, int
	 * price) { System.out.println("My computer brand name is: " + brand +
	 * " . Model is: " + model + " . Operating system is: " + operatingSystem +
	 * " . Price is: " + price); }
	 */

}
