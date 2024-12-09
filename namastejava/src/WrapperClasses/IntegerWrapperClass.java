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
		
		
//		Converting int to Integer 
		int x= 456;
		Integer X= Integer.valueOf(x);
		int y = Integer.parseInt("345");
		System.out.println("X- Integer : "+ X);
		System.out.println("y- int: "+ y);
		
		
		
		
		
		
//		==============================================================
		
//		How to check the type of the instance?

		List<String> ls = new ArrayList<String>();
		
		System.out.println(i.getClass().getName());
		System.out.println(ls.getClass().getName());
		
		
		
	}
}
