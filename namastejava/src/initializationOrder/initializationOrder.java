package initializationOrder;

public class initializationOrder {
	
	static int a;
	static int c = SMethod();
	int b;
	
	static {
		System.out.println("Static block initialized");
		a = 34;
	}
	
	{	
		System.out.println("Instance block initialized");
		b = 45;
	}
	
	public initializationOrder() {
		System.out.println("Constructor initialized");
	}
	
	static int SMethod() {
		System.out.println("This is a static method");;
		return 45;
	}
	
	void IMethod() {
		System.out.println("This is a Instance method");;
	}
	
	public static void main(String[] args) {
		
		initializationOrder i1 = new initializationOrder();
		System.out.println("Before object ");
		i1.IMethod();
		System.out.println("After object ");
		
	}
}
