package Streams;

import java.util.*;

public class Test
{
	public static void main(String[] args) {
		System.out.println("Hello World");

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> result = numbers.stream()
		                       .filter(n -> n % 2 == 1)  // step 1: filter evens
		                       .map(n -> n * n)          // step 2: double them
		                       .toList();                // step 3: collect to list

		System.out.println(result); // [4, 8]
	}
}
