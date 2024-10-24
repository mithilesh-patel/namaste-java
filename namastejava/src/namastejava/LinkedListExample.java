package namastejava;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		
		List<String> ll= new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		
		
		ll.add(ll.indexOf("B") + 1, "C");
		
		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
