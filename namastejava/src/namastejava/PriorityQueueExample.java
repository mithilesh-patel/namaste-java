package namastejava;

import java.util.*;

public class PriorityQueueExample {
	public static void main(String args[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		pq.add(12);
//		pq.add(16);
//		pq.add(69);
//		pq.add(32);
//		pq.add(71);
//		pq.add(100);
//		
//		pq.add(71);
//		pq.add(111);
//
//		pq.remove(71);
		
		System.out.println(pq.element());

		Iterator<Integer> iq = pq.iterator();

		while (iq.hasNext()) {
			System.out.println(iq.next());
		}

	}
}