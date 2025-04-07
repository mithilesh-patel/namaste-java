package interfaceeg;

public interface Runnable {
	void canIRun();
	
	String printName(String name);
	
	default void greet() {
		System.out.println("Hello from Runnable");
	}
}
