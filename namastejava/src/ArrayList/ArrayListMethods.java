package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Pineapple");
		list.add("Strawberry");
		list.remove("Mango");
		list.set(0, "Mango");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("Is the list empty" + list.isEmpty()); 
		System.out.println("Size of the list is : " + list.size()); 
		
		list.clear();
		
		System.out.println("After Remove");
		
		System.out.println("Is the list empty : " + list.isEmpty()); 
		System.out.println("Size of the list is : " + list.size()); 
		
		
	}
}
