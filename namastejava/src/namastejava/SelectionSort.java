package namastejava;

public class SelectionSort {
	
	
	public static void main(String[] args) {

		int[] list= {10,2,4,23,54,11,9};
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+ ", ");
		}
		

//==============================

		
		for(int i=0; i<list.length-1;i++) {
			
			int smallestIndex = i;
			
			for (int j = i + 1 ; j < list.length; j++) {
				if(list[j]<list[smallestIndex]) {
					smallestIndex=j;
				}
				
				int temp = list[i];
	            list[i] = list[smallestIndex];
	            list[smallestIndex] = temp;
			}
		}
        
		System.out.println();
		
		System.out.println("Sorted ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+ ", ");
		}
		
		
		
//		System.out.println("Smallest number is --> " + smallest);

		
		//First we find the smallest element and swap it with the first element. This way we get the smallest element at its correct position.
		//Then we find the smallest among remaining elements (or second smallest) and move it to its correct position by swapping.
		//We keep doing this until we get all elements moved to correct position.
		
			
			
	}
}
