package Constructor;

public class MultipleConstructorEg {
	
	int length, breadth;
	
	MultipleConstructorEg() {
//		new MultipleConstructorEg(10, 20); -> this will compile but the new constructor will not instantiate using this values
		this(10,20);
	}
	
	MultipleConstructorEg(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public static void main(String[] args) {
		MultipleConstructorEg mul = new MultipleConstructorEg()	;
		
		System.out.println("Length: "+ mul.length);
		System.out.println("Breadth: "+ mul.breadth);
	}
}
