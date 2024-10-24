package namastejava;

import java.util.*;

public class StackExample {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.pop();
//		Iterator<String> itr = stack.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
        ListIterator<String> itr = stack.listIterator(stack.size());

        while(itr.hasPrevious()){  
            System.out.println(itr.previous());  
        } 
	}
}