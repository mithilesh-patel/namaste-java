package MethodEg;

public class StaticMethodCounter {
	static int COUNTER = 10;

	static void increment() {
		COUNTER++;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(COUNTER);
		increment();
		increment();
		increment();
		increment();
		increment();
		System.out.println(COUNTER);
	}
}
