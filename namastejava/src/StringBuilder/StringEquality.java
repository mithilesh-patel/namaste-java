package StringBuilder;

public class StringEquality {
	public static void main(String[] args) {
		String a = "Apple";
		String b = "Apple";
		String c = new String("Apple");
		System.out.println(a==b);
		System.out.println(a==c);
		
		System.out.println(a.equals(c));
		
		
	}
}
