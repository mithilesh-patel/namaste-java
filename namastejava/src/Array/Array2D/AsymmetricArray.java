package Array.Array2D;

public class AsymmetricArray {
	public static void main(String[] args) {
		
		int [][] numbers = new int[4][]; 
		numbers[0] = new int[5]; 
		numbers[1] = new int[3]; 
		
		System.out.println(numbers.length); // Output - 4
		
//		The numbers.length refers to the length of the outer array, 
//		which is 4 because it was defined as new int[4][]. 
//		This is independent of the lengths of the inner arrays.
	}
}
