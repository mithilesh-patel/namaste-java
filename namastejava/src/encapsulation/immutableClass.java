package encapsulation;

// To make a class immutable remove the setters in the class and make the members private
public class immutableClass {
	
	private String name;
	private int age;
	
	public immutableClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public static void main(String[] args) {
		immutableClass i1 = new immutableClass("Mithilesh", 34);
		System.out.println(i1.getAge());
		System.out.println(i1.getName());
	}


}
