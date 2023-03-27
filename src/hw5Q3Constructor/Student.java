package hw5Q3Constructor;

public class Student {
	// variables declared
	String stName;
	int stID;
	char sex;
	boolean isProgrammer;
	float grade;

	// default constructor declared
	public Student() {
		System.out.println("This is from the default Constructor of Student class.");
	}

	// parameterized constructor declared
	public Student(String stname, int stID, char sex, float grade, boolean isProgrammer) {
		this.stName = stname;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		System.out.println("Student Name: " + stname + ", ID: " + stID + ", Sex: " + sex + ", Grade: " + grade
				+ ", and Java Programmer: Ans: " + isProgrammer + ".");
	}
}
