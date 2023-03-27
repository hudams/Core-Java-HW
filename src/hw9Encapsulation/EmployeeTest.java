package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Mohammed Huda");
		employee.setAge(25);
		employee.setSex('M');
		employee.setCitizen(true);
		System.out.println("My name is " + employee.getName() + "\nMy age is " + employee.getAge() + "\nMy sex is " + employee.getSex() + "\nI am a U.S. citizen " + employee.isCitizen());
	}
}
