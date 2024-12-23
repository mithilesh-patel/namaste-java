package MethodEg;

public class InstanceInitialization {
	
	int length;
	int breadth;
	
// INSTANCE INITIALIZATION
	{
		length = 10;
		breadth = 20;
		System.out.println("Instance Initializer called- It looks like a unnamed method");
	}
	
	public InstanceInitialization() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor called");
		length = 50;
		breadth = 50;
	}
	
	public static void main(String[] args) {
		InstanceInitialization ins = new InstanceInitialization();
		System.out.println(ins.length);
		System.out.println(ins.breadth);
	}
	
}
