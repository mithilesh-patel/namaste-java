package MethodEg;

import java.util.ArrayList;

public class StaticFinalEg {

	static final int NUMBER_OF_BUCKET = 20;
	
	private static final ArrayList<String> values = new ArrayList<>();

	// Java makes sure that the reference of the object is not changed.
	// Methods can be called on the reference
	public static void main(String[] args) {
		values.add("changed1");
		values.add("changed2");
//		NUMBER_OF_BUCKET = 4;
		
		for (String string : values) {
			System.out.println(string);
			
		} 
	}
	
}
