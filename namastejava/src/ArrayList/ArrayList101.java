package ArrayList;

import java.util.*;

public class ArrayList101 {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		
		list1.add("Mithilesh");
		list1.add("Kumar");
		list1.add("Patel");
		
		System.out.println("Arraylist contents");
		for (String string : list1) {
			System.out.println(string);
		}
		
		list1 = new LinkedList<>();
		
		list1.add("M");
		list1.add("K");
		list1.add("P");
		
		System.out.println("Linkedlist contents");
		
		for (String string : list1) {
			System.out.println(string);
		}
		
		
	}
}
