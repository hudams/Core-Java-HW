package hw12Polymorphism;
/*
 * Method overriding is multiple methods same name, same parameter but logic is different
 * Known as Dynamic polymorphism or late binding or run time polymorphism 
 * Happens in runtime 
 *   
 */
public class Niece extends Sister {
	@Override
	public int sister(int age1, int age2) {
		int total1 = age1 + age2 / 5;
		System.out.println("Total age from sister class: " + total1);
		return total1;
	}

	// 3 same data type parameterized method
	@Override
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + 2 + age2 + age3;
		System.out.println("Total age from sister class: " + total2);
		return total2;
	}

	// 4 data return type parameterized method
	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		int total3 = age1 + age2 + age3 - 3 + Integer.parseInt(age4);
		System.out.println("Total age from sister class: " + total3);
		return total3;
	}

	// 4 data different orientation return type parameterized method
	@Override
	public int sister(int age1, int age2, String age4, int age3) {
		int total4 = age1 + age2*2 + Integer.parseInt(age4) + age3;
		System.out.println("Total age from sister class: " + total4);
		return total4;
	}

	/*
	 * Final type method cannot override
	 * 
	 * // 5 data Final return type parameterized method
	 * 
	 * @Override 
	 * public final int sister(int age1, int age2, int age3, int age5, String age4) { 
	 * int total5 = age1 + age2 + age3 + age5 + Integer.parseInt(age4);
	 * System.out.println("This is a final void method from sister method"); 
	 * return total5; 
	 * }
	 * 
	 * Static method cannot override
	 * 
	 * // 5 different orientation data static parameterized method
	 * 
	 * @Override 
	 * public static int sister(int age1, int age2, int age3, String age4,int age5) { 
	 * int total6 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
	 * System.out.println("This is a return type static method from sister method: " + total6); 
	 * return total6; 
	 * }
	 * 
	 * Final type method cannot override
	 * 
	 * // Final void parameterized type method
	 * 
	 * @Override 
	 * public final void sister(String age4, int age1, int age2) {
	 * System.out.println("This is a final void method from sister method"); }
	 * 
	 * static void type method is not possible
	 * 
	 * @Override 
	 * public static void sister() {
	 * System.out.println("This is static void type method");
	 */

	// Regular void type method
	@Override
	public void sister() {
		System.out.println("This is a void method from sister method");
	}

	// Void parameterized method
	@Override
	public void sister(int age1, int age2, int age3, int age5) {
		int total7 = age1/2 + age2 + age3 + age5;
		System.out.println("Total age from void parameterized sister method: " + total7);
	}
}
