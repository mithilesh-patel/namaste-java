package Array;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String[] fruits = { "Mango", "Apple","Pineapple"};
		
		Arrays.sort(fruits);
		
		for (String string : fruits) {
			System.out.println(string);	
		}
		
		
		int[] list1 = {2,3,4,5};
		int[] list2 = {2,3,4,5};
		
		System.out.println(list1 == list2);
		

	}

}
