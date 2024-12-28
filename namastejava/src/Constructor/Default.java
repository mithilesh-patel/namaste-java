package Constructor;

public class Default {

	int x;
	{
		x = 45; // if it is declared here then it becomes local variable
//		System.out.println(x);
		System.out.println("This is Instance initializer");
	}
	
	Default(){
		System.out.println("This is the default constructor");
	}
	
	void show() {
		System.out.println("This is show method");
	}
	
	public static void main(String[] args) {
		Default d = new Default();
		d.show();
		System.out.println(d.x);
	}
	
}
