package lambdas;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MyCustomInterface{
	void display(String message);
}

public class lambdasWithArray {

	
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(23);
		numbers.add(34);
		numbers.add(45);
		numbers.add(56);
		numbers.add(67);
		numbers.add(78);
		
		numbers.forEach((n)->{System.out.println(n);});	
		
		
		MyCustomInterface mylambda = (msg) -> System.out.println("Message "+ msg);
		mylambda.display("Hello Mithilesh");
	}
}
