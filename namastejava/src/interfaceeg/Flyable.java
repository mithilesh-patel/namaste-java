package interfaceeg;

public interface Flyable {
	
	int speed = 50;
	
	void fly();
	void canIRun();
	
	String printName(String name, int age);
	
	default void greet() {
		System.out.println("Hello from Flyable");
	}
	
	default void sayHello() {
		System.out.println("sayHello Method");
	}
}
