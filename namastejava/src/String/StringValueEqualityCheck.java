package String;

public class StringValueEqualityCheck {
	public static void main(String[] args) {
		String a= "Apple";
		String b= " Apple";
		
		StringBuilder a1 = new StringBuilder("HindiHindi");
		StringBuilder b1 = new StringBuilder("Hindi");
		
		a1 = b1.append("Hindi");
		
		
//		
//		if(a.equals(b)) {
//			System.out.println("a and b are equal");
//		}else {
//			System.out.println("a and b are NOT equal");
//			
//		}
		
		System.out.println(a.equals(b));
		System.out.println(a1.equals(b1));
	}
}
