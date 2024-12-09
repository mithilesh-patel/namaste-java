package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String[] birds = {"sparrow", "parrot", "hawk"};
		
		ArrayList<String> BirdsArrayList = new ArrayList<String>();
		Collections.addAll(BirdsArrayList, birds);
		
		System.out.println("BirdsArrayList : " + BirdsArrayList);
		
		
//		Sort the collection
		Collections.sort(BirdsArrayList);
		System.out.println("BirdsArrayList : " + BirdsArrayList);
	}
}
