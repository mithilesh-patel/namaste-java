package namastejava;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set1= new HashSet<String>();
		set1.add("Hello");
		set1.add("Hello");
		set1.add("Hello");
		set1.add("Mithilesh");
		set1.add("Kumar");
		set1.add("Kumar");
		set1.add("Patel");
		
		System.out.println(set1.size());
		
		Iterator<String> itr = set1.iterator();
		
		
//		while(itr.hasNext()) {
//			String element = itr.next();
//			System.out.println(element);
//		}
		
		for(String x : set1) {
			System.out.println(x);
		}
		
	}
}
