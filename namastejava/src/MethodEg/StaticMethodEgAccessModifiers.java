package MethodEg;

public class StaticMethodEgAccessModifiers {
	static String name = "Mithilesh";
	String insVar;

	String insMethod() {

		return "From inside the Instance method";
	}

	static String StaticMethod() {

		//accessing Instance variable from static method
		System.out.println(new StaticMethodEgAccessModifiers().insVar); 

		//accessing Instance method from static method
		new StaticMethodEgAccessModifiers().insMethod();

		return "Static Method";
	}

	public static void main(String[] args) {

		// System.out.println("Hello World");

		StaticMethodEgAccessModifiers m = new StaticMethodEgAccessModifiers();

		System.out.println(m.name); // Instance to static variable
		System.out.println(m.StaticMethod()); // Instance to static method

		System.out.println(name); // Static variable calling
		System.out.println(StaticMethod()); // Static method calling

	}
}