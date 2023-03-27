package hw12Polymorphism;

/*
 * Method overloading is multiple methods name are same, parameterized orientation is different but uses same logic 
 * Method overloading happens during compile time 
 * It is also calls as first binding, static polymorphism overloading, compile time polymorphism 
 */

public class Sister {
	
	// 2 same data type parameterized method
	public int sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("Total age from sister class: " + total1);
		return total1;
	}
	
	// 3 same data type parameterized method
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("Total age from sister class: " + total2);
		return total2;
	}
	
	// 4 data return type parameterized method 
	public int sister(int age1, int age2, int age3, String age4) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Total age from sister class: " + total3);
		return total3;
	}
	
	// 4 data different orientation return type parameterized method 
	public int sister(int age1, int age2, String age4, int age3) {
		int total4 = age1 + age2 + Integer.parseInt(age4) + age3;
		System.out.println("Total age from sister class: " + total4);
		return total4;
	}
	
	// 5 data Final return type parameterized method 
	public final int sister(int age1, int age2, int age3, int age5, String age4) {
		int total5 = age1 + age2 + age3 + age5 + Integer.parseInt(age4);
		System.out.println("This is a final void method from sister method");
		return total5;
	}
	
	// 5 different orientation data static parameterized method 
	public static int sister(int age1, int age2, int age3, String age4, int age5) {
		int total6 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("This is a return type static method from sister method: " + total6);
		return total6;
	}
	
	// Final void parameterized type method
	public final void sister(String age4, int age1, int age2) {
		System.out.println("This is a final void method from sister method");
	}	
	
	/* static void type method is not possible 
	public static void sister() {
		System.out.println("This is static void type method");
	}
	*/
	
	// Regular void type method
	public void sister() {
		System.out.println("This is a void method from sister method");
	}
	
	// Void parameterized method
	public void sister(int age1, int age2, int age3, int age5) {
		int total7 = age1 + age2 + age3 + age5;
		System.out.println("Total age from void parameterized sister method: " + total7);
	}

}