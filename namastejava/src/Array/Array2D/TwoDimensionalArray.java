package Array.Array2D;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] TwoD= {{1,2,3},{4,5,6}};
		int[][] vars1;          // 2D array
		int vars2 [][];         // 2D array
		int[] vars3[];          // 2D array
		int[] vars4 [], space [][];  // a 2D AND a 3D array
		
//		System.out.println(TwoD[0][1]);

		
		
		int[][] numbers =new int[3][5];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				numbers[i][j]= i*j;
				
			}
		}
		
		for (int[] row : numbers) {
			for (int value : row) {
				System.out.print(value+ " ");
			}
			System.out.println();
		}
		
		
	}

}
