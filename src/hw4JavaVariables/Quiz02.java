package hw4JavaVariables;

public class Quiz02 {
	
	public static void p1()
	{
		System.out.println("IS");
	}
	
	public static void p2() 
	{
		System.out.println("HEAD");
	
	}
	
	public static void p3() 
	{
		p1();
		System.out.println("A");
	}

	public static void main(String[] args) 
	{
		System.out.println("BOB");
		p3();
		System.out.println("MELON");
		p2();
	}

}
