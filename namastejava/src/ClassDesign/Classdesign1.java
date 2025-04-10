package ClassDesign;

class Parent {
	private void show() {
		System.out.println("This is parents private method");
	}
}

public class Classdesign1 extends Parent {

	private int show() {
		System.out.println("This is childs private method");
		return 1;
	}

	public static void main(String[] args) {
		Classdesign1 cd = new Classdesign1();
		
		System.out.println(cd.show());
	}
}