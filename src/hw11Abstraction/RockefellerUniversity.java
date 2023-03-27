package hw11Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	public void Maths() {
		System.out.println("This non abstract method is from RockefellerUniversity");
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}
}
