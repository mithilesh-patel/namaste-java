package Phase2.Interfaces;

public class InstanceInitializer {

	String dogName = "Tommy";
	{
		System.out.println("dogName is" + dogName);
	}

	public InstanceInitializer() {
		// TODO Auto-generated constructor stub
		String dogName = "Jimmy";

		{
			System.out.println("dogName is" + dogName);
		}
	}

	
	int $value = 3244; 
	
	public static void main(String[] args) {
		int $value = 9999;
		
		
		String _validIdentifier = "Hello";
		
		InstanceInitializer ins = new InstanceInitializer();
		
		System.out.println("Instance variable value-"+ins.$value);
		System.out.println(Integer.MAX_VALUE);
		
		short i = 2;
		long l = 2_23_42_34_32_43_24l; // this is a long variable
		
		System.out.println(i);
		System.out.println(l);

		System.out.println(0x23);

		long salary = 60_000888888888l;
		System.out.println("salary"+salary);
	}

}
