package Array;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		
//		For Binary search make sure the array is sorted
		int[] numbers = {111,33,4,42,89,223};
		
		Arrays.sort(numbers);
		
		
		
		for (int i : numbers) {
			
			System.out.println(i);
		}
		int index= Arrays.binarySearch(numbers, 111);
		System.out.println("Number found at: "+ index);
	}

}
