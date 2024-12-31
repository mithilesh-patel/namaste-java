package encapsulation;

public class immutableClass {
	
	String name;
	int age;
	
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
