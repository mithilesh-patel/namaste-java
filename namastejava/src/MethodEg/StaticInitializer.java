package MethodEg;

public class StaticInitializer {
	
	private static final int TOTAL;
	
	static {
		int length = 20;
		int breadth = 20;
		
		TOTAL = length*breadth;
	}
	
	
	public static void main(String[] args) {
		System.out.println(TOTAL);
	}
}
