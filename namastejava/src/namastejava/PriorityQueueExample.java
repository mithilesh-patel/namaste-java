package namastejava;

import java.util.*;

public class PriorityQueueExample {
	public static void main(String args[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(12);
		pq.offer(16);
		pq.offer(69);
		pq.offer(32);
		pq.offer(71);
		pq.offer(100);
		
		pq.offer(71);
		pq.offer(111);

		pq.remove(71);
		pq.poll();

		Iterator<Integer> iq = pq.iterator();

		while (iq.hasNext()) {
			System.out.println(iq.next());
		}
		
		System.out.println("=====================");
		
		System.out.println(pq.element());

	}
}