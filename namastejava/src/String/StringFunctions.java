package String;

public class StringFunctions {

	public static void main(String[] args) {
		String name = "Mithilesh Kumar Patel";
		String name2 = "Mithilesh KUMAR Patel";
		String name3 = "            Mithilesh KUMAR Patel        ";
		
		
		System.out.println("Length of 'name' is "+ name.length());
		System.out.println("ChatAt at index 5 is "+ name.charAt(5));
		System.out.println("Index of 'i' is "+ name.indexOf('i')); // This will throw the first occurrence of 'i'
		System.out.println("Substring from 5 to 10: "+ name.substring(5, 11));
		System.out.println("toLowerCase() "+ name.toLowerCase());
		System.out.println("toUpperCase() "+ name.toUpperCase());
		System.out.println("equals: "+ name.equals(name2));
		System.out.println("equals: "+ name.equalsIgnoreCase(name2));
		System.out.println("startsWith : "+ name.startsWith("Mithi"));  //True
		System.out.println("startsWith : "+ name.startsWith("Hello"));  //False
		System.out.println("endsWith : "+ name.endsWith("tel"));  //True
		System.out.println("endsWith : "+ name.endsWith("Hello"));  //False
		System.out.println("Contains : "+ name.contains("Mithi"));
		System.out.println("Contains : "+ name.contains("Hello"));
		System.out.println("trim method : "+ name.trim());
		System.out.println("replace method : "+ name.replace('M', 'J'));   //Jithilesh Kumar Patel
		
	}
}
