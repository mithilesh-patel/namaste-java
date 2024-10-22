package namastejava;

public class Functions {
	
	String name="Default Name";
	
	public void changeNum(Functions f) {
		f.name = "New Name";
		System.out.println(f.name);
	}
	
	
	public static void main(String[] args) {
		int n=1000;
		Functions f = new Functions();
		f.changeNum(f);		
		System.out.println(f.name);
	}
	
	
}
