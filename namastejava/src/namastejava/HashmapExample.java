package namastejava;

import java.util.HashMap;

public class HashmapExample{
	public static void main(String[] args) {
		System.out.println("This is Hashmap");
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);

	}
}
