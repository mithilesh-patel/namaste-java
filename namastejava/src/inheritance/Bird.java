package inheritance;

public class Animal {
	private int age = 20;
	public int length;
	public int breadth;
	
	Animal(int length , int breadth){
		this.length = length;
		this.breadth = breadth;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
