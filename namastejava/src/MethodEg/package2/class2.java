package MethodEg.package2;

class class3 {
	public void showMethodClass3() {
		System.out.println("This method is from showMethod3, Hello Mithilesh");
	}
}

public class class2 extends class3 {
	public static void main(String[] args) {
		class2 c2 = new class2();
		c2.showMethodClass3();
	}
}
