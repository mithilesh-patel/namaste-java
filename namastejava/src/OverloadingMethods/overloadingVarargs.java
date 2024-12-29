package OverloadingMethods;

public class overloadingVarargs {

//	static int multiply(int... x) {
//		int mul = 1;
//		for (int a : x) {
//			mul = a * mul;
//		}
//		return mul;
//	}
	
	static int multiply(int[] x) {
	    int mul = 1;
	    		
		for (int i : x) {
			mul  = mul * i;
		}
		
		return mul;
	}
	
	

	public static void main(String[] args) {
		
		
	}

}
