package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This is a default constructor in parent class Father");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\nThis is parametarized type constructor from parent class Father");
		System.out.println("name: " + name + "\nage: " + age + "\nsex: " + sex + "\nusCitizen: " + usCitizen);
	}

	public void father() {
		System.out.println("\nThis is a regular void type method from parent class Father\n");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\nThis is parametarized type method from parent class Father");
		System.out.println("name: " + name + "\nage: " + age + "\nsex: " + sex + "\nusCitizen: " + usCitizen);
		}
}
