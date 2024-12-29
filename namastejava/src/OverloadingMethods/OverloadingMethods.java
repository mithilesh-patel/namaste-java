package OverloadingMethods;

public class OverloadingMethods {
	
	// Method Signature = Method name + Parameter list
	// Everything other than the method signature can vary for overloaded methods. This 
	// means there can be different access modifiers, specifiers (like static), return types, and 
	// exception lists. 
	
	static void multiply(int a,int b) {
		System.out.println("a multiplied by b is "+ a*b);	
	}
	
	static int multiply(int a,int b, int c) {
		return a*b*c;		
	}
	
	static boolean multiply() {
		return true;		
	}
	
	public static void main(String[] args) {
		multiply(2,5);
		int mul = multiply(2,5,8);
		System.out.println(mul);
		
		System.out.println(multiply());
	}
}
