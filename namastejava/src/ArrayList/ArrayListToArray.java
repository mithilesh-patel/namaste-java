package ArrayList;

import java.util.*;

public class ArrayListToArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Lion");
		list.add("Tiger");
		list.add("Eagle");
		
		String[] animals = list.toArray(new String[0]);
		
//		Check type of animals
		System.out.println(animals.getClass().getSimpleName());
		
		for (String animal : animals) {
			System.out.println(animal);
		}
	}
}
