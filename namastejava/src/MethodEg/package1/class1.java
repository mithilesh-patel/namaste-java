package MethodEg.package1;

import MethodEg.package2.class2;


private class Ctest{
	void methodinCtest() {
		System.out.println("This is methodinCtest");
	}
}


public class class1 {
	
	private void privateMethodEg() {
		System.out.println("This is Private Method");
	}
	
	public void showMethodClass1() {
		System.out.println("This method is from showMethod1");
	}
	
	public static void main(String[] args) {
		class1 c11 = new class1();
		class2 c22 = new class2();
		class33 c33 = new class33();
		c22.showMethodClass3();
		c11.privateMethodEg();
		c33.methodfromclass33();
	}
}
