package namastejava;

import java.util.*;

class Person{
	
	String name;
	String address;
	
}



public class ArrayListExample {
	public static void main(String[] args) {
		
		
		Person p1= new Person();
		Person p2= new Person();
		Person p3= new Person();
		
		
		p1.name="Mohan";
		p1.address="Delhi";
		

		p2.name="Pratik";
		p2.address="Mumbai";
		

		p3.name="Ram";
		p3.address="Ayodhya";
		
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		
		
        for (Person p : list) {
			System.out.println(p.name);
			System.out.println(p.address);
			System.out.println("==============================");
		}
	}
}
