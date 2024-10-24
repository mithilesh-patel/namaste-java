package namastejava;
import java.util.*;

public class DequeExample {
	public static void main(String[] args) {
		Deque<String> dq= new ArrayDeque<String>();
		dq.add("Mithilesh");
		dq.add("Kumar");
		dq.addFirst("Shri");
		dq.addLast("Patel");
		
		Iterator<String> it = dq.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
