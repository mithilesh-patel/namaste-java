package StringBuilder;

public class StringBuilderEquality {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = sb1.append("Mithilesh");
		
		System.out.println(sb1==sb2); // False
		System.out.println(sb3==sb1); // True
	}
}
