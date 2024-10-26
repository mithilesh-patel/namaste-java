package Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = {40,1,1,3,2,85,83,9};
		
		System.out.println("Before sorting");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ ", ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1 -i; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("\nAfter sorting");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ ", ");
		}
	}
}
