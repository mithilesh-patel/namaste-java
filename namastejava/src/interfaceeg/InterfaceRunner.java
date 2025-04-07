package interfaceeg;

public class InterfaceRunner implements Flyable, Runnable {

	public void fly() {
		System.out.println("Hey i can fly");
	}

	public void canIRun() {
		System.out.println("Yes Bro u can run");
	}

	@Override
	public String printName(String name, int age) {
		return "This is the name from Flyable: " + name + " and age: " + age;

	}

	@Override
	public String printName(String name) {
		return "This is the name from Runnable: " + name;
	}

	public void greet() {
//		Flyable.super.greet();
//		Runnable.super.greet();
		
		System.out.println("THis is the new implementation of Greet method");
	}
	
//	public void sayHello() {
//		System.out.println("Hola");
//	}

	public static void main(String[] args) {

		InterfaceRunner Parrot = new InterfaceRunner();
		Parrot.fly();
		System.out.println(Flyable.speed);
		Parrot.canIRun();

		System.out.println(Parrot.printName("Mithilesh"));
		System.out.println(Parrot.printName("Mithilesh", 27));
		Parrot.sayHello();
		new InterfaceRunner().greet();
		
	}

}
