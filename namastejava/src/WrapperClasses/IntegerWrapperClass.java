package WrapperClasses;

import java.util.*;

public class IntegerWrapperClass {
	public static void main(String[] args) {
		
//		Autoboxing:  Auto conversion of int to Integer
		Integer i = 34;
		System.out.println(i);
		
		
//		Unboxing
		int j = i;
		System.out.println(j);
		
		List<String> ls = new ArrayList<String>();
		
		System.out.println(i.getClass().getName());
		System.out.println(ls.getClass().getName());
	}
}
